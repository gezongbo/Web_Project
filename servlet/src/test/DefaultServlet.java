package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//缺省servlet
public class DefaultServlet extends HttpServlet{

	//调出service方法
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//创建日期，并将日期返回到网页中
		Date d=new Date();
		//获得输出流PrintWriter
		PrintWriter pw=response.getWriter();
		pw.println(d);
		
	}

}
