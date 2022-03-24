package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��1��ͨ��request�����ȡ������������Ϣ
public class RequestDemo1 extends HttpServlet{

	//����service����
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ͨ��response����������������ҳ�����
		PrintWriter pw=response.getWriter();
		//1����ȡ������˷������������·��
		StringBuffer sbuf=request.getRequestURL();
		pw.println(sbuf.toString());//http://localhost:8080/servlet/request1
		//2����ȡ��Դ������-����·����8080��ĵ�ַ
		String uri=request.getRequestURI();
		pw.println("uri="+uri); // uri=/servlet/request1
		//3����ȡ����·���в�������
		String qs=request.getQueryString();
		//�������������http://localhost:8080/servlet/request1?a=1&b=2&c=3
		pw.println("qs="+qs); //qs=a=1&b=2&c=3
		//4���������·���е�ip��ַ
		String ip=request.getRemoteAddr();
		pw.println("ip="+ip);  //ip=127.0.0.1
		//5����ȡ�������������ķ�ʽ��get����post����
		//��������ˣ��������ַ���س��������ӡ�����Ĭ�Ϸ�ʽ����get����ʽ
		//��������ˣ�������method="post"�ķ�ʽ�ύ��post����ʽ
		String method=request.getMethod();
		pw.println("method="+method);  //method=GET
		//6����ȡwebӦ����
		String cp=request.getContextPath();
		pw.println("cp="+cp); //cp=/servlet
		
	}
	
	
}
