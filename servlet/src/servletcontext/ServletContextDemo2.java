package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��������л�ȡֵ
//��ȡ��ServletContextDemo1�д洢��ֵ
public class ServletContextDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("����ServletContextDemo2....");
		//��request������л�ȡ����
		/*
		Integer itgA=(Integer)request.getAttribute("a");
		System.out.println(itgA);
		*/
		
		//��ServletContext������л�ȡ����
		//���ServletContext����
		ServletContext sct=this.getServletContext();
		Integer itgB=(Integer)sct.getAttribute("b");
		System.out.println("context2�е�itgB��ֵΪ:"+itgB);
		Date date=(Date)sct.getAttribute("t");
		System.out.println(date);
	
	}

}
