package com.lddx.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Student;

public class TestServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("测试...");
		Student stu=new Student();
		//从数据库中查询数据，将查询的数据设置到javabean属性中
		stu.setAge(60);
		stu.setName("赵六");
		stu.setId(1000);
		
		
		//发送到页面显示  --  el05.jsp
		request.setAttribute("stu", stu);
		request.setAttribute("a", 1);
		request.getRequestDispatcher("el05.jsp").forward(request, response);
		
	}

}
