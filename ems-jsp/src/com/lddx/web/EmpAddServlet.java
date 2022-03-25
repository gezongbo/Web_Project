package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//控制层的Servlet类
//主要完成的功能是：员工信息的添加功能
public class EmpAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置请求参数中中文编码
		request.setCharacterEncoding("utf-8");
		//接收表单提交请求中的参数
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strName+","+strSalary+","+strAge);
		
		//调用模型层中的方法
		EmpDao dao=new EmpDao();
		dao.addEmpInfo(strName, Double.parseDouble(strSalary), Integer.parseInt(strAge));
		
		//调用模型层完成插入功能以后，跳转回http://localhost:8080/ems-jsp/list首页
		//转发  重定向
		response.sendRedirect("list");
		
	}

}
