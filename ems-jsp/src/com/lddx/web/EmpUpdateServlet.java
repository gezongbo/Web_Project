package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//属于服务器端的控制层的Servlet类
//功能：完成员工信息的修改
public class EmpUpdateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置参数中文编码
		request.setCharacterEncoding("utf-8");
		//1、接收页面端点击修改按钮发送过来的请求，同时也接受请求中的参数
		String strId=request.getParameter("id");
		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strId+","+strName+","+strSalary+","+strAge);
		
		//2、调用模型层，由模型层来完成数据的修改
		EmpDao dao=new EmpDao();
		dao.updateEmpById(Integer.parseInt(strId), strName, 
				Double.parseDouble(strSalary), Integer.parseInt(strAge));
		
		//3、模型层修改完成以后，返回http://localhost:8080/ems-jsp/list首页
		//重定向
		response.sendRedirect("list");
		
	
	}

}
