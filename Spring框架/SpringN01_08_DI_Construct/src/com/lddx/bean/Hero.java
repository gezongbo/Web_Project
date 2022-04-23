package com.lddx.bean;

import java.util.List;

//英雄类--javabean规范
public class Hero {
	
	private String name;
	private int age;
	private List<String> jobs;
	private Dog dog;
	private Cat cat;
	
	//有参构造
	public Hero(String name, int age, List<String> jobs, Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.jobs = jobs;
		this.dog = dog;
	}	
	//无参构造
	public Hero() {
	
	}
	public Hero(String name, int age, List<String> jobs, Dog dog, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.jobs = jobs;
		this.dog = dog;
		this.cat = cat;
	}

	//get set方法
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
	public List<String> getJobs() {
		return jobs;
	}
	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	//toString方法
	@Override
	public String toString() {
		return "Hero [age=" + age + ", cat=" + cat + ", dog=" + dog + ", jobs="
				+ jobs + ", name=" + name + "]";
	}
	
	

	
}
