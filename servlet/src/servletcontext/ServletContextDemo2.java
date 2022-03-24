package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示从域对象中获取值
//获取从ServletContextDemo1中存储的值
public class ServletContextDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("我是ServletContextDemo2....");
		//从request域对象中获取数据
		/*
		Integer itgA=(Integer)request.getAttribute("a");
		System.out.println(itgA);
		*/
		
		//从ServletContext域对象中获取数据
		//获得ServletContext对象
		ServletContext sct=this.getServletContext();
		Integer itgB=(Integer)sct.getAttribute("b");
		System.out.println("context2中的itgB的值为:"+itgB);
		Date date=(Date)sct.getAttribute("t");
		System.out.println(date);
	
	}

}
