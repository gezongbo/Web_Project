package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
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
		//将请求向下一个过滤器或者目标资源进行传递
		chain.doFilter(request, response);
	}

	//初始化方法，在过滤器对象被创建出来时，服务器会调用该方法进行一些初始化工作
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("DemoFilter初始化");
	}

}
