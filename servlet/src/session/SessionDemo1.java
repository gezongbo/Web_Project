package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//��ʾSession��ʹ��
public class SessionDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Session���ڷ�������ʹ�õ�һ�ּ���
		//Session���ڷ������˴����ģ�Ҳ���ڷ������˴洢������
		//��ȡSession����
		HttpSession session=request.getSession();
		//��Session�����д�����
		session.setAttribute("a", 1);
		session.setAttribute("name", "����");
	
	}
}
