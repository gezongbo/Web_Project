package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示HttpServletResponse对象中的常用方法
public class ResponseDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig scf=this.getServletConfig();
		
		
		//设置显示到浏览器端的文本格式和编码
		//response.setContentType("text/html;charset=utf-8");
		//另外一种写法，使用setHeader方法
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		
		//IO  分字节流  字符流
		//获得字符流，将数据写到浏览器端  PrintWriter
		/*
		PrintWriter pw=response.getWriter();
		pw.println(100);
		pw.println("<br/>");   //换行
		pw.println("hello1");
		pw.write("<br/>");     //换行
		pw.write("helloworld\n");
		pw.write("hellowrold", 0, 5);
		pw.println();
		pw.write("你好");
		pw.println("<a href=''>点我去百度</a>");
		*/
		
		//获得字节流，将数据写到浏览器端
	    ServletOutputStream sos=response.getOutputStream();
		sos.write("200".getBytes());
		sos.write("\n".getBytes());
		byte[] bs="world".getBytes();
		sos.write(bs);
		sos.write("<br/>".getBytes());
		sos.write("中国".getBytes("utf-8"));
		
	}

}
