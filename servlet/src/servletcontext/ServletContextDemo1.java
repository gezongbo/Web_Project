package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾServletContext��Ϊ�����Ĺ��ܣ�ʵ�ַ�Χ�ڵ���Դ����
public class ServletContextDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("����ServletContextDemo1...");
		
		/*
		//��ϰ��ʹ��request�����request�������������һ�������еķ�Χ��
		//ֻҪ��һ�������еķ�Χ�Ϳ���ʵ����Դ�Ĺ���������Դ�޷�ʵ�ֹ���
		request.setAttribute("a", 1);
		//ͬһ��Servlet���У��ܹ���ȡ��request�����洢��ֵ(ͬһ��Servlet����������ִ�У���ͬһ������)
		Integer strA=(Integer)request.getAttribute("a");
		System.out.println(strA);//1
		//ͨ��ת������ServletContextDemo1ת����ת��ServletContextDemo2
		//�����ת��������һ�����󣬾���ʹ��request�����ʵ����Դ�Ĺ���
		RequestDispatcher rd=request.getRequestDispatcher("context2");
		rd.forward(request, response);
		*/
		
		//ʹ��ServletContext�����:ServletContext���������������webӦ��
		//��ȡServletContext����
		ServletContext sct=this.getServletContext();
		//��ServletContext������д洢����
		sct.setAttribute("b", 2);
		Date time=new Date();
		System.out.println("time��"+time);
		sct.setAttribute("t", time);
		//ͬһ��Servlet�У�ServletContext����ʵ����Դ����
		Integer itgB=(Integer)sct.getAttribute("b");
		System.out.println("context1�е�itgB��ֵΪ:"+itgB);
		//ͨ��ת����������ServletContextDemo1��ת��ServletContextDemo2
		//RequestDispatcher rd=request.getRequestDispatcher("context2");
		//rd.forward(request, response);
		
	}

}












