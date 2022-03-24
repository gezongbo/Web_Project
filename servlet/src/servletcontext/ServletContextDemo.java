package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示ServletContext对象的使用
public class ServletContextDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、获取ServletContext对象
		//方法一：通过ServletConfig来获取
		ServletConfig scf=this.getServletConfig();
		ServletContext sct=scf.getServletContext();
		
		//方法二：通过this直接获取
		//ServletContext sct=this.getServletContext();
		
		//根据name来获得value
		//String s1=sct.getInitParameter("data1");
		//String s2=sct.getInitParameter("data2");
		//System.out.println(s1+" "+s2);
		
		//获得所有的name的值
		Enumeration<String> ns=sct.getInitParameterNames();
		while(ns.hasMoreElements()){
			String name=ns.nextElement();
			String value=sct.getInitParameter(name);
			System.out.println(name+","+value);
		}
		
	}
	
}
