package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ȱʡservlet
public class DefaultServlet extends HttpServlet{

	//����service����
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//�������ڣ��������ڷ��ص���ҳ��
		Date d=new Date();
		//��������PrintWriter
		PrintWriter pw=response.getWriter();
		pw.println(d);
		
	}

}
