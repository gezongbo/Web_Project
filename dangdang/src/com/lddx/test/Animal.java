package com.lddx.test;

public class Animal {
	private String name;
	private int age;
	public int a;
	
	//get �� set ����
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
	
	//���췽��
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal����вι���");
	}
	public Animal() {
		System.out.println("Animal����޲ι���");
	}
	@Override
	public String toString() {
		return "Animal [a=" + a + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
}
