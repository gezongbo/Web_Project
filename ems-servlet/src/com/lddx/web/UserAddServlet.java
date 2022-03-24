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
//Ա����Ϣ�����Servlet
public class UserAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("���servlet....");
		//http://localhost:8080/ems-servlet/add?id=11&name=zss&salary=2222&age=10&smt=%E6%8F%90%E4%BA%A4
		//���������еĲ���
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSal=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+" "+strName+" "+strSal+" "+strAge);
		
		try {
			//2~3 ʹ��jdbc�������ݿ⣬������ݵĲ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="insert into user values(?,?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1,Integer.parseInt(strId));
			prep.setString(2,strName);
			prep.setDouble(3,Double.parseDouble(strSal));
			prep.setInt(4,Integer.parseInt(strAge));
			//ִ��sql���
			prep.executeUpdate();
			//�ر����ݿ������
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//4 ����ɹ��Ժ󣬻ص�list��ҳ
		//�ض���   ת��   
		//http://localhost:8080/ems-servlet/list�ض���
		response.sendRedirect("list");
		
		
	}

}
