package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//�������˵Ŀ��Ʋ� C-- servlet��   -- ��Ա����Ϣ�Ĳ�ѯ��
public class EmpListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��������˷��͹������󣬵��������˵�Servlet��--�����ڿ��Ʋ�
		//�ڿ��Ʋ�ȥ����ģ�Ͳ�
		EmpDao dao=new EmpDao();
		//����ģ�Ͳ㣨dao���������صĽ��
		ResultSet rs=dao.getAllEmps();
		
		//�ɿ��Ʋ㽫ģ�Ͳ㷵�صĽ��������ͼ�㣨V��emplist.jsp
		//servlet   -->��ת��       jsp
		//ת�� ���ض���
		//��Ҫ�������rsһ�𽻸�jspҳ�棬�������洢���ݣ�ʵ����Դ�Ĺ���
		request.setAttribute("rs", rs);
		//ת����emplist.jspҳ��
		request.getRequestDispatcher("emplist.jsp").forward(request, response);
		
	}
}
