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
//服务器端  -- 控制层
//完成查看购物车的功能
public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//思路：1、接收点击购物车超链接发送过来的请求
		//System.out.println("测试....");
		//    2、获得session,从session中取出购物车cart
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		//System.out.println(cart);
		if(cart==null){  //没有买过任何的图书
			request.setAttribute("itemList", null);
		}else{  //购买过图书的情况
//		    3、将购物车cart中的集合itemList发送到cart.jsp页面中
			//从session取出的购物车不为空
			ArrayList<BookItem> itemList=cart.getItemList();
			//System.out.println("CartServlet...."+itemList);
			//使用转发
			request.setAttribute("itemList", itemList);//将集合放入request域对象中
			double totalSave=cart.getTotalSave();
			request.setAttribute("totalSave",totalSave);//总节省金额
			double totalPrice=cart.getTotalPrice();
			request.setAttribute("totalPrice", totalPrice);//总消费金额
			
		}
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		
	}

}
