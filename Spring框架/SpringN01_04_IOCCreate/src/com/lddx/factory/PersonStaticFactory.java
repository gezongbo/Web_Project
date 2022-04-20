package com.lddx.factory;

import com.lddx.bean.Person;

//Person类的静态工厂
public class PersonStaticFactory {
	//封装一个获取Person对象的静态方法
	public static Person getPerson(){
		Person p=new Person("张三");
		return p;
	}
	public static Person getPerson1(){
		Person p=new Person(20);
		return p;
	}
}
