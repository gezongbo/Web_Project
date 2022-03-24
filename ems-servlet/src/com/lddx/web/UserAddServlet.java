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
//员工信息的添加Servlet
public class UserAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("添加servlet....");
		//http://localhost:8080/ems-servlet/add?id=11&name=zss&salary=2222&age=10&smt=%E6%8F%90%E4%BA%A4
		//接收请求中的参数
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSal=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+" "+strName+" "+strSal+" "+strAge);
		
		try {
			//2~3 使用jdbc连接数据库，完成数据的插入操作
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="insert into user values(?,?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1,Integer.parseInt(strId));
			prep.setString(2,strName);
			prep.setDouble(3,Double.parseDouble(strSal));
			prep.setInt(4,Integer.parseInt(strAge));
			//执行sql语句
			prep.executeUpdate();
			//关闭数据库的连接
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//4 插入成功以后，回到list首页
		//重定向   转发   
		//http://localhost:8080/ems-servlet/list重定向
		response.sendRedirect("list");
		
		
	}

}
