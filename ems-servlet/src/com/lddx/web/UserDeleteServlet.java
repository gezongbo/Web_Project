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

//员工信息删除的Servlet
public class UserDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收请求中的参数
		//http://localhost:8080/ems-servlet/delete?id=2
		String strId=request.getParameter("id");
		//System.out.println("工号:"+strId);
		try {
			//2~3，使用JDBC连接mysql数据库，完成删除的操作
			Connection con=DBUtil.getCon();
			//System.out.println(con);//com.mysql.jdbc.JDBC4Connection@64dfeb
			//预编译sql语句
			String sql="delete from user where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			//设置sql语句中的问号   参数1：表示第几个问好   参数2：对问号设置的内容
			prep.setInt(1,Integer.parseInt(strId));
			//执行sql语句
			//executeUpdate()适用于删除delete、修改update、插入insert     executeQuery()适用于查询select
			prep.executeUpdate();
			//关闭数据库的连接
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//4，删除成功以后，回到http://localhost:8080/ems-servlet/list首页地址
		//转发技术：将未完成的工作交给下一个组件继续完成，浏览器地址栏的地址不会发生变化，它是一次请求
		//重定向技术：已经完成了工作，只是为了跳转到下一个地址显示，浏览器地址栏的地址会发生变化，是两次请求
		//写一个Servlet对应的url-pattern地址，会重定向到对应的Servlet来执行
		response.sendRedirect("list");
		
		
	}
}





