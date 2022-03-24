package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//访问RequestDemo4
//由RequestDemo4请求转发到RequestDemo5中，带请求包含的转发来实现

public class RequestDemo4 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("欢迎来到demo4....");
		PrintWriter pw=response.getWriter();
		pw.println("demo4....servlet...first");
		
	    //带请求包含的转发--向RequestDemo5转发
		//获得转发器，指定转发地址
		RequestDispatcher rd=request.getRequestDispatcher("request5");
		//带请求包含的转发
		rd.include(request, response);
		
		pw.println("demo4....servlet...after");
		System.out.println("demo4...继续执行");
	}
}
