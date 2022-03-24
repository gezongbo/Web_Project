package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾHttpServletResponse�����еĳ��÷���
public class ResponseDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig scf=this.getServletConfig();
		
		
		//������ʾ��������˵��ı���ʽ�ͱ���
		//response.setContentType("text/html;charset=utf-8");
		//����һ��д����ʹ��setHeader����
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		
		//IO  ���ֽ���  �ַ���
		//����ַ�����������д���������  PrintWriter
		/*
		PrintWriter pw=response.getWriter();
		pw.println(100);
		pw.println("<br/>");   //����
		pw.println("hello1");
		pw.write("<br/>");     //����
		pw.write("helloworld\n");
		pw.write("hellowrold", 0, 5);
		pw.println();
		pw.write("���");
		pw.println("<a href=''>����ȥ�ٶ�</a>");
		*/
		
		//����ֽ�����������д���������
	    ServletOutputStream sos=response.getOutputStream();
		sos.write("200".getBytes());
		sos.write("\n".getBytes());
		byte[] bs="world".getBytes();
		sos.write(bs);
		sos.write("<br/>".getBytes());
		sos.write("�й�".getBytes("utf-8"));
		
	}

}
