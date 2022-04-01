package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//服务器端的Servlet
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置参数中的中文编码
		//request.setCharacterEncoding("utf-8");
		
		//接收表单提交的参数
		String strName=request.getParameter("name");
		System.out.println("姓名为:"+strName);
		
		
	}

}
