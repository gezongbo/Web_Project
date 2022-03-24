package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//删除Cookie
//在没有关闭浏览器（会话）和最大存活时间没有到的情况下，代码手动删除Cookie
public class CookieDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//删除Cookie，同名、同path，设置存活时间为0
		//删除Cookie中存储的a的值
		//1、创建一个同名的Cookie    要和删除的Cookie存储的名字一致
		Cookie c=new Cookie("a","");
		//2、设置和要删除的Cookie一样的path
		c.setPath("/servlet");
		//3、设置Cookie的最大存活时间为0
		c.setMaxAge(0);
		//添加Cookie
		response.addCookie(c);
	}
}
