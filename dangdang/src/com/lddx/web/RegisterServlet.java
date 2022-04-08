package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.dao.impl.UserDaoImpl;
//完成注册页面的注册功能
public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//http://localhost:8080/dangdang/register
		//?email=abddc%40qq.cdom&nickname=aaaaaa&password=abc123&password1=abc123&validateCode=Db49
		//1、接收注册页面点击注册的请求，同时接收表单提交的参数
		request.setCharacterEncoding("utf-8");
		String strEmail=request.getParameter("email");
		String strNickname=request.getParameter("nickname");
		String strPwd=request.getParameter("password");
		//System.out.println(strEmail+","+strNickname+","+strPwd);
		
		//2、调用模型层，让模型层将提交的数据插入到数据库里
		UserDao dao=new UserDaoImpl();
		User user=new User();
		user.setEmail(strEmail);
		user.setNickname(strNickname);
		user.setPassword(strPwd);
		dao.saveUser(user);
		
		//3、当模型层完成插入以后，跳转到登录页面(login.jsp)
		//转发   重定向
		response.sendRedirect("login.jsp");
		
	}

}
