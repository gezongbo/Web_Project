package com.lddx.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Student;

public class TestServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("����...");
		Student stu=new Student();
		//�����ݿ��в�ѯ���ݣ�����ѯ���������õ�javabean������
		stu.setAge(60);
		stu.setName("����");
		stu.setId(1000);
		
		
		//���͵�ҳ����ʾ  --  el05.jsp
		request.setAttribute("stu", stu);
		request.setAttribute("a", 1);
		request.getRequestDispatcher("el05.jsp").forward(request, response);
		
	}

}
