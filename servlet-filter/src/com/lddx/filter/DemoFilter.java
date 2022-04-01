package com.lddx.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//服务器端的一个过滤器
public class DemoFilter implements Filter{

	//销毁的方法，在过滤器对象被销毁之前，服务器会调用这个方法执行善后的工作
	public void destroy() {
		System.out.println("DemoFilter销毁");
	}

	//过滤器中最核心的方法，当过滤器拦截到对目标资源的访问时，该方法进行过滤处理
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("DemoFilter核心方法");
		System.out.println("DemoFilter核心方法...before");
		//将请求向下一个过滤器或者目标资源进行传递
		chain.doFilter(request, response);
		System.out.println("DemoFilter核心方法...after");
	}

	//初始化方法，在过滤器对象被创建出来时，服务器会调用该方法进行一些初始化工作
	public void init(FilterConfig config) throws ServletException {
		System.out.println("DemoFilter初始化");
		//功能1：使用参数FilterConfig来获取配置的初始化参数
		//String strAge=config.getInitParameter("age");
		//String strSalary=config.getInitParameter("salary");
		//System.out.println(strAge+","+strSalary);
		//获取配置的参数中所有的name值
		Enumeration<String> emt=config.getInitParameterNames();
		while(emt.hasMoreElements()){
			String name=emt.nextElement();
			String value=config.getInitParameter(name);
			System.out.println(name+","+value);
		}
		//功能2：通过FilterConfig来获取ServletContext对象
		//ServletContext功能1：获取全局的初始化参数
		ServletContext context=config.getServletContext();
		String strData1=context.getInitParameter("data1");
		System.out.println(strData1);
		//ServletContext功能2：作为域对象存储数据
		context.setAttribute("id", 10001);
		
		
	}

}





