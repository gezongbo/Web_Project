package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
import com.lddx.bean.User;
//服务器端的Servlet类
//处理购物车页面中结算的功能
public class OrderServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//思路：1、接收页面点击结算发送过来的请求
		//System.out.println("测试....");
		//    2、获取session，从session中获取user
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		//    3、如果获取的user为null,说明你还未登录，直接跳转到登录页面login.jsp
		//      如果获取的user不为null,说明已经登录过了，跳转到order_info.jsp,把购物车的信息显示在确认订单的页面中
		if(user==null){  //未登录的情况
			response.sendRedirect("login.jsp");
			//request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{ //已经登录过了
			//从session中获取购物车cart,通过购物车获取购物车的图书
			Cart cart=(Cart)session.getAttribute("cart");
			//通过cart购物车获得集合，因为集合中存储了所有的购买的图书
			ArrayList<BookItem> itemList=cart.getItemList();
			//求消费总价
			double totalPrice=cart.getTotalPrice();
			//将totalPrice也放入request域中存储
			request.setAttribute("totalPrice", totalPrice);
			//如果此处把itemList存储到request域中，跳转的方式只能用转发技术
			request.setAttribute("itemList", itemList);
			request.getRequestDispatcher("order_info.jsp").forward(request, response);
			
		}

		
	}
}
