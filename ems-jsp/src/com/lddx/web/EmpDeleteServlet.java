package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//���Ʋ�
//���Ա����Ϣ��ɾ��
public class EmpDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ҳ����ɾ��Ա�������󣬻�����Ա����id
		String strId=request.getParameter("id");
		System.out.println(strId);
		//����ģ�Ͳ㣬��ģ�Ͳ���������ݿ��ɾ��
		EmpDao dao=new EmpDao();
		dao.deleteEmpById(Integer.parseInt(strId));
		//��Ӧ��list��ҳ
		response.sendRedirect("list");
		
	}
}
