package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//服务器端的第二个过滤器
public class DemoFilter1 implements Filter{

	@Override
	public void destroy() {
		System.out.println("DemoFilter1销毁....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("DemoFilter1的核心方法....");
		System.out.println("DemoFilter1核心方法...before");
		//向下一个过滤器或者目标资源跳转
		chain.doFilter(request, response);
		System.out.println("DemoFilter1核心方法...after");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("DemoFilter1初始化...");
	}

}
