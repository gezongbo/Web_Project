package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Ա����Ϣ��ѯ��Servlet
public class UserListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//˼·��2~3��ʹ��JDBC����mysql���ݿ⣬��user���е������ѯ����
		ResultSet rs=null;
		try {
			//��1��ע���������
			Class.forName("com.mysql.jdbc.Driver");
			//��2��������ݿ������
			String url="jdbc:mysql://localhost:3306/ems";
			String user="root";
			String password="";
			Connection con=DriverManager.getConnection(url, user, password);
			//System.out.println(con);//com.mysql.jdbc.JDBC4Connection@3e8ad1
			//��3��Ԥ����sql���
			String sql="select * from user";
			PreparedStatement prep=con.prepareStatement(sql);
			//��4��ִ��sql��䣬��ý����
			rs=prep.executeQuery();
			/*
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}

		//4��ʹ��response������ַ������PrintWriter������ѯ���Ľ��������������
		//������Ӧ��������˵ĸ�ʽ�ͱ���
		response.setContentType("text/html;charset=utf-8");
		//������������һ�����
		PrintWriter pw=response.getWriter();
		pw.println("<table border='1' cellspacing='0' width='400' height='80' align='center'>");
		pw.println("<caption>Ա����Ϣ��</caption>");
		//���ĵ�һ��
		pw.println("<tr align='center'>");
		pw.println("<td>����</td><td>����</td><td>����</td><td>����</td><td>����</td>");
		pw.println("</tr>");
		//���ĵڶ���
		//ʹ��ѭ������������е����ݣ����ݽ�����е����ݣ���̬���ɱ��ĵ�2�е���n��
		try {
			while(rs.next()){
				pw.println("<tr align='center'><td>"+rs.getInt("id")+"</td><td>"
						+rs.getString("name")+"</td><td>"+rs.getDouble("salary")
						+"</td><td>"+rs.getInt("age")
						+"</td><td><a href='delete?id="+rs.getInt("id")+"'>ɾ��</a></td></tr>");
				         //�����ӵ�href=""��ַ���д����һ��Servlet��url-pattern��ַ�����������
				         //������ӦServlet��������
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�������һ��
		pw.println("<tr><td colspan='5'><a href='addUser.html'>���Ա����Ϣ</a></td></tr>");
		pw.println("</table>");
		
		//��5���ر����ݿ������
		
		
	}

}
