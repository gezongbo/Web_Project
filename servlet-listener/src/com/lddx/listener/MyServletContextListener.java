package com.lddx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//������������ServletContext�Ĵ���������
public class MyServletContextListener implements ServletContextListener{

	//��ServletContext������ʱ����ִ�и÷���
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext��������...");
	}

	//��ServletContext������ʱ����ִ�и÷���
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext��������...");
		
	}

}
