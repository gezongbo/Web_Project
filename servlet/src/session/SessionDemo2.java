package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//获取Session中的数据
public class SessionDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取Session对象
		HttpSession session=request.getSession();
		Integer itgA=(Integer)session.getAttribute("a");
		String strName=(String)session.getAttribute("name");
		//设置网页的格式和编码
		response.setContentType("text/html;charset=utf-8");
		//将获取的值输出在网页上
		PrintWriter pw=response.getWriter();
		pw.println("Session中a的值为:"+itgA);
		pw.println("Session中name的值为:"+strName);
	}

}
