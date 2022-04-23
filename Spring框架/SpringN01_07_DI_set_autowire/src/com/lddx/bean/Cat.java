package com.lddx.bean;
//Ã¨ -- javabean--¶ÔÏó
public class Cat {
	private String name;
	private int age;
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
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		super();
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	
}
