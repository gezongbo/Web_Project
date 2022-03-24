package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示ServletContext来获取资源文件的路径
public class ServletContextDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ServletContext对象
		ServletContext sct=this.getServletContext();
		//()里设置的是资源文件，该方法返回该资源文件对应的动态路径
		String path=sct.getRealPath("/aa.txt");
		System.out.println(path);
		//C:\Users\qingd\mywork\tomcat\apache-tomcat-7.0.68\webapps     tomcat服务器的磁盘路径
		//\servlet   web项目名
		//\aa.txt    资源文件名
	}
}
