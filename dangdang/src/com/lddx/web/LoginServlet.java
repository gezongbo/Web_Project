package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.dao.impl.UserDaoImpl;
//完成登录的Servlet
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、接收登录页面点击登录的请求，同时接收登录页面传递的邮箱和密码参数
		String strEmail=request.getParameter("email");
		String strPwd=request.getParameter("password");
		//System.out.println(strEmail+","+strPwd);
		//2、调用模型层，让模型层去检查邮箱和密码在数据库中是否正确，返回检查的结果
		UserDao dao=new UserDaoImpl();
		User user=dao.isLogin(strEmail, strPwd);
		//System.out.println(user);
		//3、根据模型层返回的结果，跳转到登录页面或者booklist首页
		if(user==null){ //说明邮箱或者密码不正确
			request.setAttribute("msg","邮箱或者密码不正确");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{  //邮箱和密码正确的情况
			//转发：浏览器地址栏不会发生变化   localhost:8080/dangdang/booklist
			//request.getRequestDispatcher("booklist").forward(request, response);
			//将user对象放入域对象中存储
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			//重定向:浏览器地址栏地址会发生变化，变化的是重定向以后的地址
			response.sendRedirect("booklist");
		}
		
		
		
	}
}
