package com.lddx.test;

public class Cat extends Animal{
	private String name;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Cat() {
		System.out.println(super.getName());
		System.out.println(getAge());
		System.out.println(a);
		System.out.println("Cat����޲ι���");
	}
	public Cat(String name,String sex){
		//ִ�и�����޲ι���
		//super();  //��д��Ĭ�ϵײ�Ҳ��ִ�и�����޲ι���
		super("��è",5);//ִ�и�����вι���
		this.name=name;
		this.sex=sex;
		System.out.println("Cat����вι���");
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", sex=" + sex + "]";
	}
	
}
