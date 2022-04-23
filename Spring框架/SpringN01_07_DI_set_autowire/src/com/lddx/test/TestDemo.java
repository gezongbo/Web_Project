package com.lddx.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Dog;
import com.lddx.bean.Hero;


//������
public class TestDemo {

	/*
	 * DI--setע��--�Զ�װ��
	 */
	@Test
	public void test01(){
		//��ʼ��Spring����������XML�ļ�
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡHero����
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		Dog dog1=hero.getDog();
		System.out.println(dog1);//Dog [age=3, name=����]
		//ͨ��id��ȡDog��
		Dog dog2=(Dog)context.getBean("dog");
		System.out.println(dog2);//Dog [age=3, name=����]
	}
	

}
