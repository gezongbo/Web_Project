package com.lddx.bean;

public class Dog {
	private String name;
	private int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}
	
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
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	
}
