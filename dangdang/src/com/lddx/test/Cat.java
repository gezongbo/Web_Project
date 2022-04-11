package com.lddx.test;

public class Cat extends Animal{
	private String name;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Cat() {
		System.out.println(super.getName());
		System.out.println(getAge());
		System.out.println(a);
		System.out.println("Cat类的无参构造");
	}
	public Cat(String name,String sex){
		//执行父类的无参构造
		//super();  //不写，默认底层也会执行父类的无参构造
		super("大猫",5);//执行父类的有参构造
		this.name=name;
		this.sex=sex;
		System.out.println("Cat类的有参构造");
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", sex=" + sex + "]";
	}
	
}
