package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//HttpServlet��java�ṩ�ľ��н��պ���Ӧ������࣬�����Լ������HelloServlet����
//Ҳ���н��պ���Ӧ����Ĺ��ܣ�ͬʱ����HelloServlet������չ�Լ��Ĺ��ܣ�ʹ�ü̳оͿ���������
public class HelloServlet extends HttpServlet{

	//����service����   Alt+/
	//request�������������ڽ�����������͹���������
	//response�����������������������Ӧ
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�����̨Console���hello
		System.out.println("hello");
		//���ݿ⡣����
		//��������������
		PrintWriter pw=response.getWriter();
		pw.println("<div style='color:red;font-size:50px;'>helloservlet11</div>");
		pw.println("<a href='http://www.baidu.com'>to taobao</a>");
		
		
	}
	
}
