package com.lddx.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

//������������request��������ӡ��޸ĺ�ɾ�����ݵĲ���
public class MySRAL implements ServletRequestAttributeListener{

	//������request��������������ݵķ���
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("������..."+arg0.getName()+","+arg0.getValue());
	}

	//������request��������Ƴ����ݵķ���
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("�Ƴ���..."+arg0.getName()+","+arg0.getValue());
	}

	//����request��������޸����ݵķ���
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("�޸���..."+arg0.getName()+","+arg0.getValue());
	}

}
