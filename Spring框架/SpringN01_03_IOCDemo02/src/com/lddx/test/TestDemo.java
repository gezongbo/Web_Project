package com.lddx.test;

import javax.swing.JFrame;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//测试类
public class TestDemo {

	/*
	 * IOC获取对象的方式
	 *   1、通过bean标签中的id属性来获取对象（最常用的一种方式）
	 *   2、通过bean标签的class属性来获取对象
	 *   3、通过别名来获取对象（前提需要使用alias标签定义别名）
	 */
	@Test
	public void test01(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1、通过id属性来获取对象
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);//com.lddx.bean.Person@1989b5
		//2、通过class属性来获取对象
		//Person p2=context.getBean(Person.class);
		//System.out.println(p2);//com.lddx.bean.Person@1989b5
		//当<bean>标签中有相同的class属性的值，再通过class来获取会报异常。
		//3、通过别名来获取对象
		Person p3=(Person)context.getBean("per1");
		System.out.println(p3);//p1和p3输出的结果一致，说明是同一个对象
		
	}
	
	
}
