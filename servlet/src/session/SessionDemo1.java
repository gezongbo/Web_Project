package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//演示Session的使用
public class SessionDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Session是在服务器端使用的一种技术
		//Session是在服务器端创建的，也是在服务器端存储的数据
		//获取Session对象
		HttpSession session=request.getSession();
		//往Session对象中存数据
		session.setAttribute("a", 1);
		session.setAttribute("name", "张三");
	
	}
}
