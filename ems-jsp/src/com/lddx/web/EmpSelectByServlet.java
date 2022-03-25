package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//���ڷ������˵Ŀ��Ʋ��Servlet��
//���ܣ�����ҳ����޸�Ա�����͹��������󣬲�ѯҪ�޸ĵ�һ��Ա������Ϣ
public class EmpSelectByServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���յ���޸�Ա����������Ĳ���
		String strId=request.getParameter("id");
		//System.out.println(strId);

		//����ģ�Ͳ�
		EmpDao dao=new EmpDao();
		ResultSet rs=dao.getEmpById(Integer.parseInt(strId));
		//System.out.println(rs);//com.mysql.jdbc.JDBC4ResultSet@7bf4c3
		//��������е�����ȡ������һ�£���Ϊ�ò�ѯ�Ǹ���id�������Ĳ�ѯ����ôrs�������Ҫ��û�����ݣ�Ҫ��ֻ��һ������
		/*
		try {
			if(rs.next()){
				System.out.println(rs.getInt("id")+","+rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		//�Ѿ��õ�ģ�Ͳ㷵�صĽ��������ת��updateEmp.jspҳ��
		//ת��  �ض���
		//�����������request��������
		request.setAttribute("rs", rs);
		//���ת��������������ת��
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
		
	}

}
