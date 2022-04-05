package com.lddx.test;
//子类 
public class Student extends Person{
	//方法的重载
	//在同一个类中，方法同名不同参，不同参指的是参数类型不一致
	//返回值没有要求
	public void study(String name){
		System.out.println(name);
	}
	
	public void study(int age){
		System.out.println(age);
	}
	
	public void study(String name,int age){
		System.out.println(name+","+age);
	}
	
	//重写：发生在子父类之间
	//同名，同参，同返回
	public void eat(String name){
		System.out.println("子类eat方法");
	}
	
	
}
