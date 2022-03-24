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

//员工信息查询的Servlet
public class UserListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//思路：2~3、使用JDBC连接mysql数据库，将user表中的输出查询出来
		ResultSet rs=null;
		try {
			//（1）注册加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//（2）获得数据库的链接
			String url="jdbc:mysql://localhost:3306/ems";
			String user="root";
			String password="";
			Connection con=DriverManager.getConnection(url, user, password);
			//System.out.println(con);//com.mysql.jdbc.JDBC4Connection@3e8ad1
			//（3）预编译sql语句
			String sql="select * from user";
			PreparedStatement prep=con.prepareStatement(sql);
			//（4）执行sql语句，获得结果集
			rs=prep.executeQuery();
			/*
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}

		//4、使用response，获得字符输出流PrintWriter，将查询出的结果输出到浏览器端
		//设置响应到浏览器端的格式和编码
		response.setContentType("text/html;charset=utf-8");
		//向浏览器端输出一个表格
		PrintWriter pw=response.getWriter();
		pw.println("<table border='1' cellspacing='0' width='400' height='80' align='center'>");
		pw.println("<caption>员工信息表</caption>");
		//表格的第一行
		pw.println("<tr align='center'>");
		pw.println("<td>工号</td><td>姓名</td><td>工资</td><td>年龄</td><td>操作</td>");
		pw.println("</tr>");
		//表格的第二行
		//使用循环遍历结果集中的数据，根据结果集中的数据，动态生成表格的第2行到第n行
		try {
			while(rs.next()){
				pw.println("<tr align='center'><td>"+rs.getInt("id")+"</td><td>"
						+rs.getString("name")+"</td><td>"+rs.getDouble("salary")
						+"</td><td>"+rs.getInt("age")
						+"</td><td><a href='delete?id="+rs.getInt("id")+"'>删除</a></td></tr>");
				         //超链接的href=""地址如果写的是一个Servlet的url-pattern地址，点击超链接
				         //会往对应Servlet发送请求
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//表格的最后一行
		pw.println("<tr><td colspan='5'><a href='addUser.html'>添加员工信息</a></td></tr>");
		pw.println("</table>");
		
		//（5）关闭数据库的链接
		
		
	}

}
