package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示重定向
public class ResponseDemo3 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//使用request作为域对象，存储数据
		request.setAttribute("name","zhangsan");
		
		//复习转发
		//一般是事情还没有完成，交给下一个组件继续完成，浏览器地址栏的地址不会发生改变
		//转发是一次请求，request作用域中存储的数据可以实现共享
		//localhost:8080/servlet/response3
		//转发是通过HttpServletRequest对象调出的
		//RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		//使用转发器向index.jsp转发
		//rd.forward(request, response);
		
		
		
		//重定向
		//一般是事情已经完成了，只是为了下一个组件的跳转，浏览器地址栏的地址会发生变化
		//重定向是两次请求，request作用域中存储的数据不能实现共享
		//localhost:8080/servlet/response3
		//localhost:8080/servlet/index.jsp
		//重定向是通过HttpServletResponse对象调出的
	    response.sendRedirect("index.jsp");
		//response.sendRedirect("register.html");
		
	}

}










