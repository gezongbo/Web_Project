package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�������˵�һ��Servlet
//�����£��̳С�����������
public class DemoServlet extends HttpServlet{

	//����service����
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("����DemoServlet...");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw=response.getWriter();
		pw.println("����DemoServlet�����ҳ���ϵ�����...");
		//��ȡServletContext����������л�ȡֵ
		ServletContext context=this.getServletContext();
		//int-->Integer   long-->Long   double-->Double  
		Integer id=(Integer)context.getAttribute("id");
		System.out.println("Servlet�л�ȡ��id��ֵΪ:"+id);
		
	}
	
	
}
