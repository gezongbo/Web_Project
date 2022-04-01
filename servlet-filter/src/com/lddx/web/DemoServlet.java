package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//服务器端的一个Servlet
//三件事：继承、方法、配置
public class DemoServlet extends HttpServlet{

	//调出service方法
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("我是DemoServlet...");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw=response.getWriter();
		pw.println("我是DemoServlet输出到页面上的内容...");
		//获取ServletContext，从域对象中获取值
		ServletContext context=this.getServletContext();
		//int-->Integer   long-->Long   double-->Double  
		Integer id=(Integer)context.getAttribute("id");
		System.out.println("Servlet中获取的id的值为:"+id);
		
	}
	
	
}
