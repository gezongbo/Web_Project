package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.util.DBUtil;

//Ա����Ϣɾ����Servlet
public class UserDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���������еĲ���
		//http://localhost:8080/ems-servlet/delete?id=2
		String strId=request.getParameter("id");
		//System.out.println("����:"+strId);
		try {
			//2~3��ʹ��JDBC����mysql���ݿ⣬���ɾ���Ĳ���
			Connection con=DBUtil.getCon();
			//System.out.println(con);//com.mysql.jdbc.JDBC4Connection@64dfeb
			//Ԥ����sql���
			String sql="delete from user where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			//����sql����е��ʺ�   ����1����ʾ�ڼ����ʺ�   ����2�����ʺ����õ�����
			prep.setInt(1,Integer.parseInt(strId));
			//ִ��sql���
			//executeUpdate()������ɾ��delete���޸�update������insert     executeQuery()�����ڲ�ѯselect
			prep.executeUpdate();
			//�ر����ݿ������
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//4��ɾ���ɹ��Ժ󣬻ص�http://localhost:8080/ems-servlet/list��ҳ��ַ
		//ת����������δ��ɵĹ���������һ�����������ɣ��������ַ���ĵ�ַ���ᷢ���仯������һ������
		//�ض��������Ѿ�����˹�����ֻ��Ϊ����ת����һ����ַ��ʾ���������ַ���ĵ�ַ�ᷢ���仯������������
		//дһ��Servlet��Ӧ��url-pattern��ַ�����ض��򵽶�Ӧ��Servlet��ִ��
		response.sendRedirect("list");
		
		
	}
}





