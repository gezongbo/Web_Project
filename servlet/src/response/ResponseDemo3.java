package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ�ض���
public class ResponseDemo3 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ʹ��request��Ϊ����󣬴洢����
		request.setAttribute("name","zhangsan");
		
		//��ϰת��
		//һ�������黹û����ɣ�������һ�����������ɣ��������ַ���ĵ�ַ���ᷢ���ı�
		//ת����һ������request�������д洢�����ݿ���ʵ�ֹ���
		//localhost:8080/servlet/response3
		//ת����ͨ��HttpServletRequest���������
		//RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		//ʹ��ת������index.jspת��
		//rd.forward(request, response);
		
		
		
		//�ض���
		//һ���������Ѿ�����ˣ�ֻ��Ϊ����һ���������ת���������ַ���ĵ�ַ�ᷢ���仯
		//�ض�������������request�������д洢�����ݲ���ʵ�ֹ���
		//localhost:8080/servlet/response3
		//localhost:8080/servlet/index.jsp
		//�ض�����ͨ��HttpServletResponse���������
	    response.sendRedirect("index.jsp");
		//response.sendRedirect("register.html");
		
	}

}










