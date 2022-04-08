package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//完成登录的Servlet
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、接收登录页面点击登录的请求，同时接收登录页面传递的邮箱和密码参数
		
		//2、调用模型层，让模型层去检查邮箱和密码在数据库中是否正确，返回检查的结果
		
		//3、根据模型层返回的结果，跳转到登录页面或者booklist首页
		
	}
}
