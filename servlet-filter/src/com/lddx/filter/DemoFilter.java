package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//�������˵�һ��������
public class DemoFilter implements Filter{

	//���ٵķ������ڹ�������������֮ǰ��������������������ִ���ƺ�Ĺ���
	public void destroy() {
		System.out.println("DemoFilter����");
	}

	//������������ĵķ����������������ص���Ŀ����Դ�ķ���ʱ���÷������й��˴���
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("DemoFilter���ķ���");
		//����������һ������������Ŀ����Դ���д���
		chain.doFilter(request, response);
	}

	//��ʼ���������ڹ��������󱻴�������ʱ������������ø÷�������һЩ��ʼ������
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("DemoFilter��ʼ��");
	}

}
