package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ɾ��Cookie
//��û�йر���������Ự���������ʱ��û�е�������£������ֶ�ɾ��Cookie
public class CookieDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ɾ��Cookie��ͬ����ͬpath�����ô��ʱ��Ϊ0
		//ɾ��Cookie�д洢��a��ֵ
		//1������һ��ͬ����Cookie    Ҫ��ɾ����Cookie�洢������һ��
		Cookie c=new Cookie("a","");
		//2�����ú�Ҫɾ����Cookieһ����path
		c.setPath("/servlet");
		//3������Cookie�������ʱ��Ϊ0
		c.setMaxAge(0);
		//���Cookie
		response.addCookie(c);
	}
}
