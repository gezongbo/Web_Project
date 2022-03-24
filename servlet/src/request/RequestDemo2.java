package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//访问RequestDemo2
//由RequestDemo2请求转发到RequestDemo3
public class RequestDemo2 extends HttpServlet{

	//调出doGet方法
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("到了demo2...");
		//使用resp获得输出流，向页面输出内容
		PrintWriter pw=resp.getWriter();
		pw.println("demo2....servlet");
		
		//请求转发：由当前RequestDemo2转发到RequestDemo3
		//获得转发器
		RequestDispatcher rd=req.getRequestDispatcher("request3");
		//往request域对象中存储数据(Object)   a:100   msg:"你好啊"
		req.setAttribute("msg","你好啊");
		req.setAttribute("a", 100);
		//请求转发
		rd.forward(req, resp);
		
		pw.println("demo2...servlet...继续执行...");
		System.out.println("我是demo2,继续执行...");
	}
	
}









