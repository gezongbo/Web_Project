package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Cookie的语法演示
public class CookieDemo1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建Cookie，存储a=1数据
		Cookie c1=new Cookie("a","1");
		Cookie c2=new Cookie("b","2");
		Cookie c3=new Cookie("c",URLEncoder.encode("土豆丝", "utf-8"));
		
		//设置Cookie的最大存活时间
		c1.setMaxAge(3000);   //存活300秒
		c2.setMaxAge(3000);    //存活10秒
		//设置Cookie的路径
		//如果不使用setPath设置Cookie路径，默认是/web应用这个路径
		//默认路径是/servlet，可以在servletweb应用下共享Cookie
		//c1.setPath("/servlet/test1/a1");
		//c2还是默认路径：/servlet
		
		
		//添加Cookie
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);

	}

}
