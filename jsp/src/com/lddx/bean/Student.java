package com.lddx.bean;
//ѧ������    ��==����
/*
 *   ����   ==  ����/��Ա����
 *   ��Ϊ  ==  ����
 */
//ͬʱ������ȥ����javabean�Ĺ淶
public class Student {
	//����  == ����/��Ա����
	private int id;        //ѧ��
	private String name;  //����
	private int age;      //����
	
	//���һ���޲ι���  -- Ĭ�ϵ�
	public Student() {
		
	}
		
	//���һ���вι���
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//��Ϊ  == ����
	public void study(){
		System.out.println(name+age);
	}
	
	public void eat(){
		
	}
	
	//���toString����
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
}
