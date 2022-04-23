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
	 * ʹ���Լ��ķ�ʽ����Hero�࣬����ֵ
	 */
	@Test
	public void test01(){
		Hero hero=new Hero();
		hero.setName("zs");
		hero.setAge(3);
		System.out.println(hero);//Hero [age=3, name=zs]
		List<String> list=new ArrayList<String>();
		list.add("sk1");
		list.add("sk2");
		//Hero hero1=new Hero("ls",5,list);
		//System.out.println(hero1);//Hero [age=5, name=ls]
		//Dog d=new Dog();
		Dog d1=new Dog("С��");
		d1.setAge(6);
		System.out.println(d1);
		//Dog d2=new Dog("С��",3);
	}
	
	/*
	 * DI--���췽��ע��
	 */
	@Test
	public void test02(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡHero
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		//Hero [age=0, name=null]
		//Hero [age=10, name=����]
		//Hero [age=10, jobs=[��·, ��·, ��Ұ], name=����]
	}

	
	
	
	
}
