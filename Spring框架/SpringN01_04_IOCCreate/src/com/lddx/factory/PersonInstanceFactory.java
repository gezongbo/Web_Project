package com.lddx.factory;

import com.lddx.bean.Person;

//Person���ʵ������
public class PersonInstanceFactory {
	//��װ�Ǿ�̬�������÷�������Person����
	public Person getPerson(){
		Person p=new Person("����");
		return p;
	}
	public Person getPerson1(){
		Person p=new Person(50);
		return p;
	}
	
	
}
