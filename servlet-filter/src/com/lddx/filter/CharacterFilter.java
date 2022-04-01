package com.lddx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//服务器端的一个过滤器
//对表单post提交，中文编码的设置
public class CharacterFilter implements Filter{
	
	String encoding=null;  //编码值

	public void destroy() {
		encoding=null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("CharacterFilter过滤器的核心方法。。。");
		//设置中文编码
		System.out.println("CharacterFilter过滤器的核心方法:"+encoding);
		if(encoding!=null){
			request.setCharacterEncoding(encoding);
		}
		//向下一个过滤器或者下一个servlet跳转
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		//通过FilterConfig来获取在web.xml中配置的初始化参数
		encoding=config.getInitParameter("codding");
		//encoding="gbk";
	}

}




