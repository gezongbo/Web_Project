package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//检查验证码是否正确的Servlet
public class CheckCodeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收ajax发送过来的参数
		String validateCode=request.getParameter("code");
		//System.out.println(validateCode);  //在注册页面，输入的验证码内容
		
		//获取到在服务器端生成的那个验证码
		//拿生成的验证码(strCode)和输入的验证码(validateCode)比较
		//选择使用session或者ServletContext来实现两个Servlet之间的资源的共享
		HttpSession session=request.getSession();
		String strCode=(String)session.getAttribute("strCode");
		
		PrintWriter pw=response.getWriter();//向页面的输出流
		//比较
		if(strCode.equals(validateCode)){   //相等的情况，输入的验证码是正确的
			pw.write("1");  //1表示正确
		}else{  //不相等的情况，输入的验证码是错误的
			pw.write("0"); //0表示错误
		}
		
	}

}
