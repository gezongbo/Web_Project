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
//控制层
public class EmpSelectByServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//点击修改员工的超链接发送过来的请求，同时接收员工的id
		String strId=request.getParameter("id");
		System.out.println(strId);
		
		//调用模型层，由模型层根据id来进行数据的查询
		EmpDao dao=new EmpDaoImpl();
		Emp emp=dao.getEmpById(Integer.parseInt(strId));
		System.out.println(emp);
		
		//将模型层查询的数据，通过转发技术，转发到updateEmp.jsp页面
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
	}

}
