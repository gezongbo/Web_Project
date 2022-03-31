package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.dao.impl.EmpDaoImpl;
//控制层
public class EmpListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//调用模型层，由模型层负责查询结果
		EmpDao dao=new EmpDaoImpl();
		ArrayList<Emp> emps=dao.getAllEmps();
		
		//将模型层查询的结果交给视图层
		//模型层 --> 视图层
		//将集合emps放入域对象中存储
		request.setAttribute("emps",emps);
		//获得转发器进行请求转发
		request.getRequestDispatcher("emplist.jsp").forward(request, response);
		
	}

}
