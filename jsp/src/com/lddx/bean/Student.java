package com.lddx.bean;
//学生对象    类==对象
/*
 *   特征   ==  属性/成员变量
 *   行为  ==  方法
 */
//同时该类兼顾去符合javabean的规范
public class Student {
	//特征  == 属性/成员变量
	private int id;        //学号
	private String name;  //姓名
	private int age;      //年龄
	
	//添加一个无参构造  -- 默认的
	public Student() {
		
	}
		
	//添加一个有参构造
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//添加get和set方法
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	//行为  == 方法
	public void study(){
		System.out.println(name+age);
	}
	
	public void eat(){
		
	}
	
	//添加toString方法
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
}
