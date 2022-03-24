package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//继承  方法  配置
//接收注册页面表单请求的servlet
public class RegisterServlet1 extends HttpServlet{

	
	//调出doGet方法   -- 只接收get请求方式
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//System.out.println("测试doGet...");
		//使用req接收请求参数
		String strName=req.getParameter("username");
		System.out.println("strName="+strName);//?????
		//处理中文乱码问题
		byte[] bs=strName.getBytes("iso8859-1");
		System.out.println(Arrays.toString(bs));//  [-27, -68, -96, -28, -72, -119]
		String name=new String(bs,"utf-8");
		System.out.println(name);//张三
		
		
	
		
	}
	
	//调出doPost方法  --只接收post请求方式
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置请求参数中的编码
		req.setCharacterEncoding("utf-8");
		//System.out.println("测试doPost...");
		//使用req接收请求参数
		String strName=req.getParameter("username");
		System.out.println(strName);//张三	
	}
	
	//调出service方法 -- get请求和post请求都接收
	/*
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("测试service...");
	}
	*/
	
}
