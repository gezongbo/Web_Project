package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�������˵�Servlet��
//����ͻ���ַҳ������һ���Ĺ���
public class AddressServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//˼·��1�������ͻ���ַҳ������һ��������ͬʱ��ȡҳ������ݹ��������ݣ��ջ��ˡ���ַ��������롢�绰���ֻ���
		String receiveName=request.getParameter("receiveName");
		String fullAddress=request.getParameter("fullAddress");
		String postalCode=request.getParameter("postalCode");
		String phone=request.getParameter("phone");
		String mobile=request.getParameter("mobile");
		System.out.println(receiveName);
		System.out.println(fullAddress);
		System.out.println(postalCode);
		System.out.println(phone);
		System.out.println(mobile);
		//2������ģ�Ͳ㣬��ģ�Ͳ���ɵ�ַ��Ϣ�����ݲ��뱣��insert into  d_address??????
		
		//3������ģ�Ͳ㣬��ģ�Ͳ����d_item������ݲ���
		
		//4������ģ�Ͳ㣬��ģ�Ͳ����d_order������ݲ���
		
		//5����ת��order_ok.jspҳ�棬�����ɵĶ�����һ���͵�ҳ����ʾ
		
	}

}
