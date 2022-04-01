package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//演示request域对象中增加、修改和删除数据的操作
		//增加
		request.setAttribute("name","张三");
		//修改
		request.setAttribute("name","李四");
		//删除
		request.removeAttribute("name");
		
		
	}

}
