package com.lddx.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//������������request����Ĵ���������
public class MyServletRequestListener implements ServletRequestListener{

	//����request���ٵķ���
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("����request��������...");
	}

	//����request�����ķ���
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("����request��������...");
	}

}
