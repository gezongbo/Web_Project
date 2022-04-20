package com.lddx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//测试类
public class TestDemo {

	//添加单元测试方法
	
	/*
	 * 自己创建Person对象，调用对象中的方法
	 */
	@Test
	public void test01(){
		Person p=new Person();
		p.eat();
		p.say();
	}
	
	/*
	 *   IOC的方式：创建Person对象
	 */
	@Test
	public void test02(){
		//1、初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//说明：applicationContext.xml文件中配置了javabean类Person,Spring会管理Person(底层)
		//2、根据id获取配置的哪个javabean类
		Person p=(Person)context.getBean("person");
		//3、调用对象中的方法
		p.eat();
		p.say();
	}

	/*
	 *  IOC的原理，得出的推论：
	 *  1、默认情况下，多次获得通过一个id的bean，得到的是同一个对象
	 *  2、即使是同一个类，如果配置多个<bean>标签具有不同的id，每个id都会在内置的Map中有一对键值对，其中的值就是这个类创建的不同对象
	 */
	@Test
	public void test03(){
		//自己的方式
		/*
		Person p1=new Person();
		System.out.println(p1);  //com.lddx.bean.Person@1c86be5
		System.out.println(p1);  //com.lddx.bean.Person@1c86be5
		Person p2=new Person();
		System.out.println(p2);  //com.lddx.bean.Person@123b25c
		*/
		
		//IOC的方式
		//1、初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、根据id来获取bean
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);//com.lddx.bean.Person@c3c315
		Person p2=(Person)context.getBean("person");
		System.out.println(p2);//com.lddx.bean.Person@c3c315
		Person person2=(Person)context.getBean("person2");
		System.out.println(person2);//com.lddx.bean.Person@18d7ace
		//说明：p1和p2的结果一样，说明是同一个对象，又和person2不一样，说明不是同一个对象
		
	}
	
	
	
	
	
	
	
	
	
}
