package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//完成退出的功能
public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收点击页面退出发送过来的请求,获取session,让session失效
		HttpSession session=request.getSession();
		session.setAttribute("user", null);
		//session.invalidate();
		//重定向到booklist首页
		response.sendRedirect("booklist");
	}

}
