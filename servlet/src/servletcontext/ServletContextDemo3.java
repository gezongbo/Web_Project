package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾServletContext����ȡ��Դ�ļ���·��
public class ServletContextDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡServletContext����
		ServletContext sct=this.getServletContext();
		//()�����õ�����Դ�ļ����÷������ظ���Դ�ļ���Ӧ�Ķ�̬·��
		String path=sct.getRealPath("/aa.txt");
		System.out.println(path);
		//C:\Users\qingd\mywork\tomcat\apache-tomcat-7.0.68\webapps     tomcat�������Ĵ���·��
		//\servlet   web��Ŀ��
		//\aa.txt    ��Դ�ļ���
	}
}
