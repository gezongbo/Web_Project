package com.lddx.factory;

import org.springframework.beans.factory.FactoryBean;

import com.lddx.bean.Person;

//Person类的Spring工厂的方式
public class PersonSpringFactory implements FactoryBean<Person>{

	//获得对象
	public Person getObject() throws Exception {
		Person p=new Person("王五");
		return p;
	}

	//对象的返回类型
	public Class<?> getObjectType() {
		return Person.class;
	}

	//单例，多例
	public boolean isSingleton() {
		return true;
	}

}
