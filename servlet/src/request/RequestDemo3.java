package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo3 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("欢迎来到demo03...");
		//获得输出流，向页面输出内容
		PrintWriter pw=response.getWriter();
		pw.println("demo3....servlet....");
		
		//从request域对象中获取数据
		String strMsg=(String)request.getAttribute("msg");
		System.out.println(strMsg);
		
		Integer strA=(Integer)request.getAttribute("a");
		System.out.println(strA);
	}

}
