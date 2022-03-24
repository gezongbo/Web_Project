package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//（1）通过request对象获取浏览器端相关信息
public class RequestDemo1 extends HttpServlet{

	//调出service方法
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//通过response获得输出流，用于向页面输出
		PrintWriter pw=response.getWriter();
		//1、获取浏览器端发送请求的完整路径
		StringBuffer sbuf=request.getRequestURL();
		pw.println(sbuf.toString());//http://localhost:8080/servlet/request1
		//2、获取资源名部分-请求路径中8080后的地址
		String uri=request.getRequestURI();
		pw.println("uri="+uri); // uri=/servlet/request1
		//3、获取请求路径中参数部分
		String qs=request.getQueryString();
		//浏览器发送请求：http://localhost:8080/servlet/request1?a=1&b=2&c=3
		pw.println("qs="+qs); //qs=a=1&b=2&c=3
		//4、获得请求路径中的ip地址
		String ip=request.getRemoteAddr();
		pw.println("ip="+ip);  //ip=127.0.0.1
		//5、获取浏览器发送请求的方式（get请求、post请求）
		//在浏览器端，浏览器地址栏回车、超链接、表单的默认方式都是get请求方式
		//在浏览器端，表单设置method="post"的方式提交是post请求方式
		String method=request.getMethod();
		pw.println("method="+method);  //method=GET
		//6、获取web应用名
		String cp=request.getContextPath();
		pw.println("cp="+cp); //cp=/servlet
		
	}
	
	
}
