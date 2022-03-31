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
//���Ʋ�
public class EmpSelectByServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����޸�Ա���ĳ����ӷ��͹���������ͬʱ����Ա����id
		String strId=request.getParameter("id");
		System.out.println(strId);
		
		//����ģ�Ͳ㣬��ģ�Ͳ����id���������ݵĲ�ѯ
		EmpDao dao=new EmpDaoImpl();
		Emp emp=dao.getEmpById(Integer.parseInt(strId));
		System.out.println(emp);
		
		//��ģ�Ͳ��ѯ�����ݣ�ͨ��ת��������ת����updateEmp.jspҳ��
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
	}

}
