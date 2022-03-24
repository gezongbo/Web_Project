package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//HttpServlet是java提供的具有接收和响应请求的类，想在自己定义的HelloServlet类中
//也具有接收和响应请求的功能，同时想在HelloServlet类中扩展自己的功能，使用继承就可以做到。
public class HelloServlet extends HttpServlet{

	//调出service方法   Alt+/
	//request参数变量：用于接收浏览器发送过来的请求
	//response参数变量：用于向浏览器响应
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//向控制台Console输出hello
		System.out.println("hello");
		//数据库。。。
		//向浏览器返回你好
		PrintWriter pw=response.getWriter();
		pw.println("<div style='color:red;font-size:50px;'>helloservlet11</div>");
		pw.println("<a href='http://www.baidu.com'>to taobao</a>");
		
		
	}
	
}
