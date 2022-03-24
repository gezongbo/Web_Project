package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ȡCookie
public class CookieDemo2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ���е�Cookie
		Cookie[] cs=request.getCookies();
		//ʹ��ѭ��������cs�е���������ȡ��
		for(int i=0;i<cs.length;i++){
			Cookie c=cs[i];
			System.out.println(c.getName()+","+URLDecoder.decode(c.getValue(),"utf-8"));
		}
		
		
		
		
	}
}
