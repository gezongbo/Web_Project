package com.lddx.test;

public class Dog {
	private String name;   //С��������
	private int age;      //С��������
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//���췽��  ����
	public Dog(String n, int a) {
		this();
		name = n;
		this.age = a;
		System.out.println("Dog�вι���");
	}
	
	public Dog(String name){
		this.name=name;
		System.out.println("Dog1�������Ĺ��췽��");
	}
	
	public Dog() {
		//this("�ϻ�",3);
		this("�ϻ�");
		//this(4);
		System.out.println("Dog�޲ι���");
	}
	
	//toString����
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}
