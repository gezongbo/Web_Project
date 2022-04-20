package com.lddx.test;

import javax.swing.JFrame;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//������
public class TestDemo {

	/*
	 * IOC��ȡ����ķ�ʽ
	 *   1��ͨ��bean��ǩ�е�id��������ȡ������õ�һ�ַ�ʽ��
	 *   2��ͨ��bean��ǩ��class��������ȡ����
	 *   3��ͨ����������ȡ����ǰ����Ҫʹ��alias��ǩ���������
	 */
	@Test
	public void test01(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1��ͨ��id��������ȡ����
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);//com.lddx.bean.Person@1989b5
		//2��ͨ��class��������ȡ����
		//Person p2=context.getBean(Person.class);
		//System.out.println(p2);//com.lddx.bean.Person@1989b5
		//��<bean>��ǩ������ͬ��class���Ե�ֵ����ͨ��class����ȡ�ᱨ�쳣��
		//3��ͨ����������ȡ����
		Person p3=(Person)context.getBean("per1");
		System.out.println(p3);//p1��p3����Ľ��һ�£�˵����ͬһ������
		
	}
	
	
}
