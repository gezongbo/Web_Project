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
		System.out.println("��ӭ����demo03...");
		//������������ҳ���������
		PrintWriter pw=response.getWriter();
		pw.println("demo3....servlet....");
		
		//��request������л�ȡ����
		String strMsg=(String)request.getAttribute("msg");
		System.out.println(strMsg);
		
		Integer strA=(Integer)request.getAttribute("a");
		System.out.println(strA);
	}

}
