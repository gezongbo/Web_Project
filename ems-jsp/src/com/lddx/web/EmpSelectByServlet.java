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
//属于服务器端的控制层的Servlet类
//功能：接收页面端修改员工发送过来的请求，查询要修改的一条员工的信息
public class EmpSelectByServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收点击修改员工发送请求的参数
		String strId=request.getParameter("id");
		//System.out.println(strId);

		//调用模型层
		EmpDao dao=new EmpDao();
		ResultSet rs=dao.getEmpById(Integer.parseInt(strId));
		//System.out.println(rs);//com.mysql.jdbc.JDBC4ResultSet@7bf4c3
		//将结果集中的数据取出来看一下，因为该查询是根据id有条件的查询，那么rs结果集中要不没有数据，要不只有一条数据
		/*
		try {
			if(rs.next()){
				System.out.println(rs.getInt("id")+","+rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		//已经得到模型层返回的结果集，跳转到updateEmp.jsp页面
		//转发  重定向
		//将结果集放在request作用域中
		request.setAttribute("rs", rs);
		//获得转发器，进行请求转发
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
		
	}

}
