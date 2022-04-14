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
//购物车中数量修改的功能
public class CartUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//思路：1、接收购物车中点击变更时发送过来的请求,同时也要接收请求发送过来的参数
		String strNum=request.getParameter("num");  //变更的数量
		String strId=request.getParameter("id");   //书的id
		//System.out.println(strNum);
		//System.out.println(strId);
		//2、获得session,通过session获得购物车
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		cart.cartUpdate(Integer.parseInt(strNum), Integer.parseInt(strId));
		//3、修改完成以后，跳转到http://localhost:8080/dangdang/cart地址
		response.sendRedirect("cart");
		
		
	}

}
