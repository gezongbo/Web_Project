package com.lddx.factory;

import com.lddx.bean.Person;

//Person��ľ�̬����
public class PersonStaticFactory {
	//��װһ����ȡPerson����ľ�̬����
	public static Person getPerson(){
		Person p=new Person("����");
		return p;
	}
	public static Person getPerson1(){
		Person p=new Person(20);
		return p;
	}
}
