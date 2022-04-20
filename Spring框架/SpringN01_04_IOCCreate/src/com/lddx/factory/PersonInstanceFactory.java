package com.lddx.factory;

import com.lddx.bean.Person;

//Person类的实例工厂
public class PersonInstanceFactory {
	//封装非静态方法，该方法返回Person对象
	public Person getPerson(){
		Person p=new Person("李四");
		return p;
	}
	public Person getPerson1(){
		Person p=new Person(50);
		return p;
	}
	
	
}
