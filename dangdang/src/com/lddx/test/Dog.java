package com.lddx.test;

public class Dog {
	private String name;   //小狗的名字
	private int age;      //小狗的年龄
	
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
	
	//构造方法  重载
	public Dog(String n, int a) {
		this();
		name = n;
		this.age = a;
		System.out.println("Dog有参构造");
	}
	
	public Dog(String name){
		this.name=name;
		System.out.println("Dog1个参数的构造方法");
	}
	
	public Dog() {
		//this("老黄",3);
		this("老黄");
		//this(4);
		System.out.println("Dog无参构造");
	}
	
	//toString方法
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}
