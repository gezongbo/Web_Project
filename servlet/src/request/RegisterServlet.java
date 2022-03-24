package request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//处理表单注册提交的Servlet
public class RegisterServlet extends HttpServlet{

	//调出service方法
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//获取请求方式
		//System.out.println("请求方式="+request.getMethod());
		//System.out.println("注册...");
		//http://localhost:8080/servlet/register?username=bbb&pwd=123&smt=%CC%E1%BD%BB
		//接收表单提交发送过来的参数
		//1、根据一个name获得一个对应的value值的情况
		String strName=request.getParameter("username");
		String strPwd=request.getParameter("pwd");
		System.out.println(strName+" "+strPwd); //bbb 123
		//http://localhost:8080/servlet/register?username=aaaaa&pwd=111
		//&love=lanqiu&love=readbook&love=football&smt=%CC%E1%BD%BB
		//String strLove=request.getParameter("love");
		//System.out.println(strLove); //只能获取第一个love对应的value值
		//2、根据一个name获得多个对应的value值的情况
		String[] loves=request.getParameterValues("love");
		System.out.println(Arrays.toString(loves));//[lanqiu, readbook, football]
		//3、获取请求参数中所有的name值情况
		Enumeration<String> names=request.getParameterNames();
		System.out.println(names);//java.util.Collections$1@898587
		//使用循环将names中的内容取出
		//names.hasMoreElements()返回布尔类型的结果   如果该容器中有数据结果返回true
		//如果该容器中的数据已经取完没有数据了结果返回false
		//name容器包含的内容：[username,pwd,love,smt]
		//nextElement()方法去容器中的内容
		while(names.hasMoreElements()){
			System.out.println(names.nextElement()); 
		}
		/*
		   username
           pwd
           love
           smt
		 */
		
		
		
	}
	
}
