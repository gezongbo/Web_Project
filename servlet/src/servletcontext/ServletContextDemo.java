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
//��ʾServletContext�����ʹ��
public class ServletContextDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1����ȡServletContext����
		//����һ��ͨ��ServletConfig����ȡ
		ServletConfig scf=this.getServletConfig();
		ServletContext sct=scf.getServletContext();
		
		//��������ͨ��thisֱ�ӻ�ȡ
		//ServletContext sct=this.getServletContext();
		
		//����name�����value
		//String s1=sct.getInitParameter("data1");
		//String s2=sct.getInitParameter("data2");
		//System.out.println(s1+" "+s2);
		
		//������е�name��ֵ
		Enumeration<String> ns=sct.getInitParameterNames();
		while(ns.hasMoreElements()){
			String name=ns.nextElement();
			String value=sct.getInitParameter(name);
			System.out.println(name+","+value);
		}
		
	}
	
}
