package com.lddx.test;
//���� 
public class Student extends Person{
	//����������
	//��ͬһ�����У�����ͬ����ͬ�Σ���ͬ��ָ���ǲ������Ͳ�һ��
	//����ֵû��Ҫ��
	public void study(String name){
		System.out.println(name);
	}
	
	public void study(int age){
		System.out.println(age);
	}
	
	public void study(String name,int age){
		System.out.println(name+","+age);
	}
	
	//��д���������Ӹ���֮��
	//ͬ����ͬ�Σ�ͬ����
	public void eat(String name){
		System.out.println("����eat����");
	}
	
	
}
