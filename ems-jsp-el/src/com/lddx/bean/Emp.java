package com.lddx.bean;
//模型层  -- JavaBean类   ==  t_emp表
//私有属性
//get set方法
//构造方法
//toString方法
public class Emp {
	//私有属性
	private int id;
	private String name;
	private double salary;
	private int age;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//构造方法
	public Emp(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public Emp() {
		super();
	}
	
	//toString方法
	public String toString() {
		return "Emp [age=" + age + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + "]";
	}
	
	
	
}
