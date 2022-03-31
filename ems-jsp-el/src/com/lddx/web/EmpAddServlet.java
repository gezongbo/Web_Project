package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.dao.impl.EmpDaoImpl;
//控制层 -- servlet
//添加员工
public class EmpAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置参数中文编码
		request.setCharacterEncoding("utf-8");
		//接收页面端点击Confirm按钮发送过来的请求，同时也接收表单提交的数据
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strName+","+strSalary+","+strAge);
		
		//调用模型层，让模型层完成数据的插入工作
		EmpDao dao=new EmpDaoImpl();
		Emp emp=new Emp();
		emp.setName(strName);
		emp.setSalary(Double.parseDouble(strSalary));
		emp.setAge(Integer.parseInt(strAge));
		dao.addEmpInfo(emp);
		
		//当模型层将数据插入成功以后，回到视图层，回到list首页
		response.sendRedirect("list");
		
	}

}
