package com.lddx.test;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//测试类
public class TestDemo {

	/*
	 * 1、通过类的无参构造方法创建Person类
	 */
	@Test
	public void test01(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获得类对象
		Person p=(Person)context.getBean("person");
		//运行，控制台输出Person无参构造......结果，说明Person类中的无参构造执行了
		/*
		 * 底层：配置文件中<bean id="person" class="com.lddx.bean.Person"></bean>执行完后相当于
		 *     Class.forName("com.lddx.bean.Person") -->Person pp;  ==  Person pp=new Person()
		 *     Map.put("person",pp);
		 *     context.getBean("person")  == Map.get("person")
		 */
		System.out.println(p);
		p.eat();
		//自己创建Person类
		//new Person();   //无参构造失效，这样方式创建不正确的
		//new Person(3);  //正确，执行的是有参构造
		//如果Person类的无参构造失效，IOC创建Person这样方式也会有异常
	}
	
	
	/*
	 * 2、通过静态工厂的方式来创建对象
	 */
	@Test
	public void test02(){
		//自己的方式创建
		//Date日期
		Date date=new Date();
		System.out.println(date);//Tue Apr 19 09:56:58 CST 2022
		System.out.println(date.getDate());  //19
		System.out.println(date.getHours());  //9
		//Calendar类，是一个抽象类
		//Calendar cal=new Calendar();   //抽象类不能直接创建，抽象类也没有无参构造
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));  //19
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));  //10
		
		//使用Spring中的IOC的方式创建
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//IOC创建Date类
		Date d=(Date)context.getBean("date");
		System.out.println("d="+d);
		System.out.println(d.getHours());
		System.out.println(d.getYear());
		//IOC的无参构造方式创建Calendar类  --不行
		//Calendar calendar=(Calendar)context.getBean("cal");
		//运行会报错，因为Calendar类是抽象类，IOC底层会执行Calendar类的无参构造，会直接new Calendar，所以执行时汇报错误
		//IOC的静态工厂方式创建Calendar类
		Calendar calendar=(Calendar)context.getBean("calendar");
		System.out.println(calendar.get(Calendar.YEAR));
		//IOC的静态工厂方式创建Person类
		Person p1=(Person)context.getBean("p1");
		p1.eat();
		Person p2=(Person)context.getBean("p2");
		p2.eat();
		
	}
	
	/*
	 * 3、通过实例工厂的方式创建对象
	 */
	@Test
	public void test03(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//根据id属性的值来获取对象
		Calendar cal=(Calendar)context.getBean("calendar3");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//根据id获取Person对象
		Person p3=(Person)context.getBean("person3");
		p3.eat();
		p3.say();
	}
	
	/*
	 * 4、通过Spring工厂的方式创建对象
	 */
	@Test
	public void test04(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id来获取对象
		Calendar cal4=(Calendar)context.getBean("calendar4");
		System.out.println(cal4.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal4.get(Calendar.HOUR_OF_DAY));
		//通过id来获得Person对象
		Person p4=(Person)context.getBean("person4");
		p4.eat();
	}
	
	
	
	
	
	
	
	
}
