package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//获取Cookie
public class CookieDemo2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取所有的Cookie
		Cookie[] cs=request.getCookies();
		//使用循环将数组cs中的内容依次取出
		for(int i=0;i<cs.length;i++){
			Cookie c=cs[i];
			System.out.println(c.getName()+","+URLDecoder.decode(c.getValue(),"utf-8"));
		}
		
		
		
		
	}
}
