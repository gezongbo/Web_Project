package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.dao.impl.EmpDaoImpl;
//���Ʋ�
public class EmpListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ģ�Ͳ㣬��ģ�Ͳ㸺���ѯ���
		EmpDao dao=new EmpDaoImpl();
		ArrayList<Emp> emps=dao.getAllEmps();
		
		//��ģ�Ͳ��ѯ�Ľ��������ͼ��
		//ģ�Ͳ� --> ��ͼ��
		//������emps����������д洢
		request.setAttribute("emps",emps);
		//���ת������������ת��
		request.getRequestDispatcher("emplist.jsp").forward(request, response);
		
	}

}
