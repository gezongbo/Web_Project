package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����RequestDemo4
//��RequestDemo4����ת����RequestDemo5�У������������ת����ʵ��

public class RequestDemo4 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("��ӭ����demo4....");
		PrintWriter pw=response.getWriter();
		pw.println("demo4....servlet...first");
		
	    //�����������ת��--��RequestDemo5ת��
		//���ת������ָ��ת����ַ
		RequestDispatcher rd=request.getRequestDispatcher("request5");
		//�����������ת��
		rd.include(request, response);
		
		pw.println("demo4....servlet...after");
		System.out.println("demo4...����ִ��");
	}
}
