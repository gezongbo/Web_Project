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
//���Ʋ� -- ��������
public class EmpUpdateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���ò������ı���
		request.setCharacterEncoding("utf-8");
		//����ҳ����ύ������ͬʱҲ���ձ��ύ������
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+","+strName+","+strSalary+","+strAge);
		
		//����ģ�Ͳ㣬��ģ�Ͳ㽫���������ݿ�������޸�
		EmpDao dao=new EmpDaoImpl();
		Emp emp=new Emp();
		emp.setId(Integer.parseInt(strId));
		emp.setName(strName);
		emp.setSalary(Double.parseDouble(strSalary));
		emp.setAge(Integer.parseInt(strAge));
		dao.updateEmpById(emp);
		
		//��ת����ͼ�㣬���ص�list��ҳ
		response.sendRedirect("list");
	}

}
