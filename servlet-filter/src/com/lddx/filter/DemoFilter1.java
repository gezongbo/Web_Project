package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//�������˵ĵڶ���������
public class DemoFilter1 implements Filter{

	@Override
	public void destroy() {
		System.out.println("DemoFilter1����....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("DemoFilter1�ĺ��ķ���....");
		System.out.println("DemoFilter1���ķ���...before");
		//����һ������������Ŀ����Դ��ת
		chain.doFilter(request, response);
		System.out.println("DemoFilter1���ķ���...after");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("DemoFilter1��ʼ��...");
	}

}
