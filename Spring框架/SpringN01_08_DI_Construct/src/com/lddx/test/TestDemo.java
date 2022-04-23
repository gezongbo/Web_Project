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



//测试类
public class TestDemo {

	/*
	 * 使用自己的方式创建Hero类，并赋值
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
		Dog d1=new Dog("小黄");
		d1.setAge(6);
		System.out.println(d1);
		//Dog d2=new Dog("小黄",3);
	}
	
	/*
	 * DI--构造方法注入
	 */
	@Test
	public void test02(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Hero
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		//Hero [age=0, name=null]
		//Hero [age=10, name=后裔]
		//Hero [age=10, jobs=[边路, 中路, 打野], name=后裔]
	}

	
	
	
	
}
