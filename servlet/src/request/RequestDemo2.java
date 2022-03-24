package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����RequestDemo2
//��RequestDemo2����ת����RequestDemo3
public class RequestDemo2 extends HttpServlet{

	//����doGet����
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("����demo2...");
		//ʹ��resp������������ҳ���������
		PrintWriter pw=resp.getWriter();
		pw.println("demo2....servlet");
		
		//����ת�����ɵ�ǰRequestDemo2ת����RequestDemo3
		//���ת����
		RequestDispatcher rd=req.getRequestDispatcher("request3");
		//��request������д洢����(Object)   a:100   msg:"��ð�"
		req.setAttribute("msg","��ð�");
		req.setAttribute("a", 100);
		//����ת��
		rd.forward(req, resp);
		
		pw.println("demo2...servlet...����ִ��...");
		System.out.println("����demo2,����ִ��...");
	}
	
}









