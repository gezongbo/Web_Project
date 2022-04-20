package com.lddx.bean;

public class Person {
	//添加Person类的无参构造方法
//	public Person() {
//		System.out.println("Person无参构造......");
//	}
	//添加Person类的有参构造，如果不写无参构造，默认的无参构造会失效
	public Person(int age){
		System.out.println("Person类的有参构造..."+age);
	}
	public Person(String name){
		System.out.println("Person有参构造..."+name);
	}
	
	//方法
	public void eat(){
		System.out.println("吃...");
	}
	
	public void say(){
		System.out.println("说...");
	}
	
}
