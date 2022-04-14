package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Cart;
//服务器端的一个Servlet
//完成购物车中删除的功能
public class CartDeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//思路：1、接收购物车中点击删除的请求，同时接收请求中传递过来的参数
		String strId=request.getParameter("id");
		System.out.println(strId);
		//    2、获取session，从session获取购物车cart，通过购物车调用cartDelete方法完成图书的删除
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		cart.cartDelete(Integer.parseInt(strId));
		//    3、删除成功了，直接跳转到http://localhost:8080/dangdang/cart地址（重定向）
		response.sendRedirect("cart");
		
	
	}
}
