package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//���ڷ������˵Ŀ��Ʋ��Servlet��
//���ܣ����Ա����Ϣ���޸�
public class EmpUpdateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���ò������ı���
		request.setCharacterEncoding("utf-8");
		//1������ҳ��˵���޸İ�ť���͹���������ͬʱҲ���������еĲ���
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+","+strName+","+strSalary+","+strAge);
		
		//2������ģ�Ͳ㣬��ģ�Ͳ���������ݵ��޸�
		EmpDao dao=new EmpDao();
		dao.updateEmpById(Integer.parseInt(strId), strName, 
				Double.parseDouble(strSalary), Integer.parseInt(strAge));
		
		//3��ģ�Ͳ��޸�����Ժ󣬷���http://localhost:8080/ems-jsp/list��ҳ
		//�ض���
		response.sendRedirect("list");
		
	
	}

}
