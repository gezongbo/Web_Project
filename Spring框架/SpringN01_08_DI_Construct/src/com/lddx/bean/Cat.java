package com.lddx.bean;

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
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		super();
	}
	public Cat(String name) {
		super();
		this.name = name;
	}
	public Cat(int age) {
		super();
		this.age = age;
	}
	
}
