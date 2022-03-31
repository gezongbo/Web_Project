package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.dao.impl.EmpDaoImpl;
//���Ʋ� -- servlet
//���Ա��
public class EmpAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���ò������ı���
		request.setCharacterEncoding("utf-8");
		//����ҳ��˵��Confirm��ť���͹���������ͬʱҲ���ձ��ύ������
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strName+","+strSalary+","+strAge);
		
		//����ģ�Ͳ㣬��ģ�Ͳ�������ݵĲ��빤��
		EmpDao dao=new EmpDaoImpl();
		Emp emp=new Emp();
		emp.setName(strName);
		emp.setSalary(Double.parseDouble(strSalary));
		emp.setAge(Integer.parseInt(strAge));
		dao.addEmpInfo(emp);
		
		//��ģ�Ͳ㽫���ݲ���ɹ��Ժ󣬻ص���ͼ�㣬�ص�list��ҳ
		response.sendRedirect("list");
		
	}

}
