package com.lddx.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//监听器，监听request对象的创建和销毁
public class MyServletRequestListener implements ServletRequestListener{

	//监听request销毁的方法
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("监听request被销毁了...");
	}

	//监听request创建的方法
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("监听request被创建了...");
	}

}
