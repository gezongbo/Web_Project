package com.lddx.bean;
//ģ�Ͳ�  -- JavaBean��   ==  t_emp��
//˽������
//get set����
//���췽��
//toString����
public class Emp {
	//˽������
	private int id;
	private String name;
	private double salary;
	private int age;
	
	//���get��set����
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
	
	//���췽��
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
	
	//toString����
	public String toString() {
		return "Emp [age=" + age + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + "]";
	}
	
	
	
}
