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
	 * DI--set注入--自动装配
	 */
	@Test
	public void test01(){
		//初始化Spring容器，解析XML文件
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Hero对象
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		Dog dog1=hero.getDog();
		System.out.println(dog1);//Dog [age=3, name=旺财]
		//通过id获取Dog类
		Dog dog2=(Dog)context.getBean("dog");
		System.out.println(dog2);//Dog [age=3, name=旺财]
	}
	

}
