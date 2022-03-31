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
//控制层 -- 服务器端
public class EmpUpdateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置参数中文编码
		request.setCharacterEncoding("utf-8");
		//接收页面表单提交的请求，同时也接收表单提交的数据
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+","+strName+","+strSalary+","+strAge);
		
		//调用模型层，由模型层将数据在数据库中完成修改
		EmpDao dao=new EmpDaoImpl();
		Emp emp=new Emp();
		emp.setId(Integer.parseInt(strId));
		emp.setName(strName);
		emp.setSalary(Double.parseDouble(strSalary));
		emp.setAge(Integer.parseInt(strAge));
		dao.updateEmpById(emp);
		
		//跳转到视图层，返回到list首页
		response.sendRedirect("list");
	}

}
