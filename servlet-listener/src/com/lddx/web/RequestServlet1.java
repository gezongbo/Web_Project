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
		//��ʾrequest����������ӡ��޸ĺ�ɾ�����ݵĲ���
		//����
		request.setAttribute("name","����");
		//�޸�
		request.setAttribute("name","����");
		//ɾ��
		request.removeAttribute("name");
		
		
	}

}
