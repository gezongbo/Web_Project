package com.lddx.bean;

public class Student {

	//�޲ι��췽��
	public Student() {
		System.out.println("Student...�޲ι���");
	}
	
	//����Spring�����ڳ�ʼ����ʱ��ִ��
	//��װһ����ʼ�������ķ���--�������Զ���
	public void myInitFunc(){
		System.out.println("����....���ݿ����...");
	}
	
	//����Spring���������ٵ�ʱ��ִ��
	//��װһ�����ٲ����ķ���--�������Զ���
	public void myDestoryFunc(){
		System.out.println("�ر�...�ͷ���Դ...");
	}
	
	
}
