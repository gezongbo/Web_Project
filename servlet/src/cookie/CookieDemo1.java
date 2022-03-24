package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Cookie���﷨��ʾ
public class CookieDemo1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����Cookie���洢a=1����
		Cookie c1=new Cookie("a","1");
		Cookie c2=new Cookie("b","2");
		Cookie c3=new Cookie("c",URLEncoder.encode("����˿", "utf-8"));
		
		//����Cookie�������ʱ��
		c1.setMaxAge(3000);   //���300��
		c2.setMaxAge(3000);    //���10��
		//����Cookie��·��
		//�����ʹ��setPath����Cookie·����Ĭ����/webӦ�����·��
		//Ĭ��·����/servlet��������servletwebӦ���¹���Cookie
		//c1.setPath("/servlet/test1/a1");
		//c2����Ĭ��·����/servlet
		
		
		//���Cookie
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);

	}

}
