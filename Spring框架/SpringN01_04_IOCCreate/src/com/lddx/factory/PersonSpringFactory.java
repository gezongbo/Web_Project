package com.lddx.factory;

import org.springframework.beans.factory.FactoryBean;

import com.lddx.bean.Person;

//Person���Spring�����ķ�ʽ
public class PersonSpringFactory implements FactoryBean<Person>{

	//��ö���
	public Person getObject() throws Exception {
		Person p=new Person("����");
		return p;
	}

	//����ķ�������
	public Class<?> getObjectType() {
		return Person.class;
	}

	//����������
	public boolean isSingleton() {
		return true;
	}

}
