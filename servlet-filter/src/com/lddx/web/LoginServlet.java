package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�������˵�Servlet
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���ò����е����ı���
		//request.setCharacterEncoding("utf-8");
		
		//���ձ��ύ�Ĳ���
		String strName=request.getParameter("name");
		System.out.println("����Ϊ:"+strName);
		
		
	}

}
