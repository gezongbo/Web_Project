package com.lddx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//监听器，监听ServletContext的创建和销毁
public class MyServletContextListener implements ServletContextListener{

	//当ServletContext被销毁时，会执行该方法
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext被销毁了...");
	}

	//当ServletContext被创建时，会执行该方法
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext被创建了...");
		
	}

}
