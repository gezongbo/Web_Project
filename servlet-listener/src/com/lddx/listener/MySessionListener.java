package com.lddx.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//������������HttpSession����Ĵ���������
public class MySessionListener implements HttpSessionListener{

	//�����session�Ĵ���
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("������session�������ˡ�����");
	}

	//�����session������
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("������session�������ˡ�����");
	}

}
