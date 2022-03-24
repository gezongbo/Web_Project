package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//使用setHeader设置定时刷新，实现多少时间后进行跳转
public class ResponseDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置响应的文本和编码
		response.setContentType("text/html;charset=utf-8");
		
		//获得字符输出流
		PrintWriter pw=response.getWriter();
		pw.write("5秒后进入百度");
		
		//设置定时刷新   --多少时间后进行跳转
		//response.setHeader("Refresh","5;url=http://www.baidu.com");
		//间隔多少时间进行自刷新
		response.setHeader("Refresh", "5");
		
	}

}
