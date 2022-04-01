package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//�������˵�һ��������
//�Ա�post�ύ�����ı��������
public class CharacterFilter implements Filter{
	
	String encoding=null;  //����ֵ

	public void destroy() {
		encoding=null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("CharacterFilter�������ĺ��ķ���������");
		//�������ı���
		System.out.println("CharacterFilter�������ĺ��ķ���:"+encoding);
		if(encoding!=null){
			request.setCharacterEncoding(encoding);
		}
		//����һ��������������һ��servlet��ת
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		//ͨ��FilterConfig����ȡ��web.xml�����õĳ�ʼ������
		encoding=config.getInitParameter("codding");
		//encoding="gbk";
	}

}




