package com.lddx.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//监听器，监听HttpSession对象的创建和销毁
public class MySessionListener implements HttpSessionListener{

	//会监听session的创建
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("监听到session被创建了。。。");
	}

	//会监听session的销毁
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("监听到session被销毁了。。。");
	}

}
