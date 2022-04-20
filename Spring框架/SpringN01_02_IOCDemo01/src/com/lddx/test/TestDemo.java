package com.lddx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//������
public class TestDemo {

	//��ӵ�Ԫ���Է���
	
	/*
	 * �Լ�����Person���󣬵��ö����еķ���
	 */
	@Test
	public void test01(){
		Person p=new Person();
		p.eat();
		p.say();
	}
	
	/*
	 *   IOC�ķ�ʽ������Person����
	 */
	@Test
	public void test02(){
		//1����ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//˵����applicationContext.xml�ļ���������javabean��Person,Spring�����Person(�ײ�)
		//2������id��ȡ���õ��ĸ�javabean��
		Person p=(Person)context.getBean("person");
		//3�����ö����еķ���
		p.eat();
		p.say();
	}

	/*
	 *  IOC��ԭ���ó������ۣ�
	 *  1��Ĭ������£���λ��ͨ��һ��id��bean���õ�����ͬһ������
	 *  2����ʹ��ͬһ���࣬������ö��<bean>��ǩ���в�ͬ��id��ÿ��id���������õ�Map����һ�Լ�ֵ�ԣ����е�ֵ��������ഴ���Ĳ�ͬ����
	 */
	@Test
	public void test03(){
		//�Լ��ķ�ʽ
		/*
		Person p1=new Person();
		System.out.println(p1);  //com.lddx.bean.Person@1c86be5
		System.out.println(p1);  //com.lddx.bean.Person@1c86be5
		Person p2=new Person();
		System.out.println(p2);  //com.lddx.bean.Person@123b25c
		*/
		
		//IOC�ķ�ʽ
		//1����ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2������id����ȡbean
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);//com.lddx.bean.Person@c3c315
		Person p2=(Person)context.getBean("person");
		System.out.println(p2);//com.lddx.bean.Person@c3c315
		Person person2=(Person)context.getBean("person2");
		System.out.println(person2);//com.lddx.bean.Person@18d7ace
		//˵����p1��p2�Ľ��һ����˵����ͬһ�������ֺ�person2��һ����˵������ͬһ������
		
	}
	
	
	
	
	
	
	
	
	
}
