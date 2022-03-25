package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//���Ʋ��Servlet��
//��Ҫ��ɵĹ����ǣ�Ա����Ϣ����ӹ���
public class EmpAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����������������ı���
		request.setCharacterEncoding("utf-8");
		//���ձ��ύ�����еĲ���
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strName+","+strSalary+","+strAge);
		
		//����ģ�Ͳ��еķ���
		EmpDao dao=new EmpDao();
		dao.addEmpInfo(strName, Double.parseDouble(strSalary), Integer.parseInt(strAge));
		
		//����ģ�Ͳ���ɲ��빦���Ժ���ת��http://localhost:8080/ems-jsp/list��ҳ
		//ת��  �ض���
		response.sendRedirect("list");
		
	}

}
