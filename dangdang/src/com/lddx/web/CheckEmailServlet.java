package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//验证邮箱是否已经被注册过的Servlet
public class CheckEmailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收ajax传递过来的参数
		//...080/dangdang/checkemail?emaildata=abc@qq.com
		String strEmail=request.getParameter("emaildata");
		System.out.println(strEmail);
		
		PrintWriter pw=response.getWriter();
		//模拟，如果邮箱是abc@qq.com，返回邮箱已经被注册过了
		//如果邮箱不是abc@qq.com，返回邮箱可以使用
		if(strEmail.equals("abc@qq.com")){  //已经被注册过了
			pw.write("1");  //数字1表示已经被注册过了
		}else{  //邮箱没有被注册过，可以使用
			pw.write("0");  //数字0表示没被注册过，可以使用
		}
		
		
	}

}
