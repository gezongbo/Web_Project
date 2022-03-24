package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.dao.EmpDao;
//服务器端的控制层 C-- servlet类   -- （员工信息的查询）
public class EmpListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//当浏览器端发送过来请求，到服务器端的Servlet类--是属于控制层
		//在控制层去调用模型层
		EmpDao dao=new EmpDao();
		//接收模型层（dao工厂）返回的结果
		ResultSet rs=dao.getAllEmps();
		
		//由控制层将模型层返回的结果交给视图层（V）emplist.jsp
		//servlet   -->跳转到       jsp
		//转发 、重定向
		//需要将结果集rs一起交给jsp页面，用域对象存储数据，实现资源的共享
		request.setAttribute("rs", rs);
		//转发到emplist.jsp页面
		request.getRequestDispatcher("emplist.jsp").forward(request, response);
		
	}
}
