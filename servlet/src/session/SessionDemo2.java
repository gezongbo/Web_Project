package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//��ȡSession�е�����
public class SessionDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡSession����
		HttpSession session=request.getSession();
		Integer itgA=(Integer)session.getAttribute("a");
		String strName=(String)session.getAttribute("name");
		//������ҳ�ĸ�ʽ�ͱ���
		response.setContentType("text/html;charset=utf-8");
		//����ȡ��ֵ�������ҳ��
		PrintWriter pw=response.getWriter();
		pw.println("Session��a��ֵΪ:"+itgA);
		pw.println("Session��name��ֵΪ:"+strName);
	}

}
