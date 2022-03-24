package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示ServletContext作为域对象的功能：实现范围内的资源共享
public class ServletContextDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("我是ServletContextDemo1...");
		
		/*
		//复习：使用request域对象，request对象的作用域是一次请求中的范围，
		//只要在一次请求中的范围就可以实现资源的共享，否则资源无法实现共享
		request.setAttribute("a", 1);
		//同一个Servlet类中，能够获取到request域对象存储的值(同一个Servlet类上下依次执行，是同一个请求)
		Integer strA=(Integer)request.getAttribute("a");
		System.out.println(strA);//1
		//通过转发，由ServletContextDemo1转发跳转到ServletContextDemo2
		//如果是转发，就是一次请求，就能使用request域对象实现资源的共享
		RequestDispatcher rd=request.getRequestDispatcher("context2");
		rd.forward(request, response);
		*/
		
		//使用ServletContext域对象:ServletContext对象的最用是整个web应用
		//获取ServletContext对象
		ServletContext sct=this.getServletContext();
		//往ServletContext域对象中存储数据
		sct.setAttribute("b", 2);
		Date time=new Date();
		System.out.println("time："+time);
		sct.setAttribute("t", time);
		//同一个Servlet中，ServletContext可以实现资源共享
		Integer itgB=(Integer)sct.getAttribute("b");
		System.out.println("context1中的itgB的值为:"+itgB);
		//通过转发技术，由ServletContextDemo1跳转到ServletContextDemo2
		//RequestDispatcher rd=request.getRequestDispatcher("context2");
		//rd.forward(request, response);
		
	}

}












