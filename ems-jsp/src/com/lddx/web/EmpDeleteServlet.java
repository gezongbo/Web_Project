package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//控制层
//完成员工信息的删除
public class EmpDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收页面点击删除员工的请求，还接收员工的id
		String strId=request.getParameter("id");
		System.out.println(strId);
		//调用模型层，由模型层来完成数据库的删除
		EmpDao dao=new EmpDao();
		dao.deleteEmpById(Integer.parseInt(strId));
		//响应到list首页
		response.sendRedirect("list");
		
	}
}
