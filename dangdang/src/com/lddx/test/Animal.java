package com.lddx.test;

public class Animal {
	private String name;
	private int age;
	public int a;
	
	//get 和 set 方法
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
	
	//构造方法
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal类的有参构造");
	}
	public Animal() {
		System.out.println("Animal类的无参构造");
	}
	@Override
	public String toString() {
		return "Animal [a=" + a + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
}
