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
		System.out.println("DemoFilter���ķ���...before");
		//����������һ������������Ŀ����Դ���д���
		chain.doFilter(request, response);
		System.out.println("DemoFilter���ķ���...after");
	}

	//��ʼ���������ڹ��������󱻴�������ʱ������������ø÷�������һЩ��ʼ������
	public void init(FilterConfig config) throws ServletException {
		System.out.println("DemoFilter��ʼ��");
		//����1��ʹ�ò���FilterConfig����ȡ���õĳ�ʼ������
		//String strAge=config.getInitParameter("age");
		//String strSalary=config.getInitParameter("salary");
		//System.out.println(strAge+","+strSalary);
		//��ȡ���õĲ��������е�nameֵ
		Enumeration<String> emt=config.getInitParameterNames();
		while(emt.hasMoreElements()){
			String name=emt.nextElement();
			String value=config.getInitParameter(name);
			System.out.println(name+","+value);
		}
		//����2��ͨ��FilterConfig����ȡServletContext����
		//ServletContext����1����ȡȫ�ֵĳ�ʼ������
		ServletContext context=config.getServletContext();
		String strData1=context.getInitParameter("data1");
		System.out.println(strData1);
		//ServletContext����2����Ϊ�����洢����
		context.setAttribute("id", 10001);
		
		
	}

}





