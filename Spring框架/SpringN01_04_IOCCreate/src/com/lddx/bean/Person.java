package com.lddx.bean;

public class Person {
	//���Person����޲ι��췽��
//	public Person() {
//		System.out.println("Person�޲ι���......");
//	}
	//���Person����вι��죬�����д�޲ι��죬Ĭ�ϵ��޲ι����ʧЧ
	public Person(int age){
		System.out.println("Person����вι���..."+age);
	}
	public Person(String name){
		System.out.println("Person�вι���..."+name);
	}
	
	//����
	public void eat(){
		System.out.println("��...");
	}
	
	public void say(){
		System.out.println("˵...");
	}
	
}
