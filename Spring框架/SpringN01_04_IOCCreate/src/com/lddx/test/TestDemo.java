package com.lddx.test;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Person;

//������
public class TestDemo {

	/*
	 * 1��ͨ������޲ι��췽������Person��
	 */
	@Test
	public void test01(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��������
		Person p=(Person)context.getBean("person");
		//���У�����̨���Person�޲ι���......�����˵��Person���е��޲ι���ִ����
		/*
		 * �ײ㣺�����ļ���<bean id="person" class="com.lddx.bean.Person"></bean>ִ������൱��
		 *     Class.forName("com.lddx.bean.Person") -->Person pp;  ==  Person pp=new Person()
		 *     Map.put("person",pp);
		 *     context.getBean("person")  == Map.get("person")
		 */
		System.out.println(p);
		p.eat();
		//�Լ�����Person��
		//new Person();   //�޲ι���ʧЧ��������ʽ��������ȷ��
		//new Person(3);  //��ȷ��ִ�е����вι���
		//���Person����޲ι���ʧЧ��IOC����Person������ʽҲ�����쳣
	}
	
	
	/*
	 * 2��ͨ����̬�����ķ�ʽ����������
	 */
	@Test
	public void test02(){
		//�Լ��ķ�ʽ����
		//Date����
		Date date=new Date();
		System.out.println(date);//Tue Apr 19 09:56:58 CST 2022
		System.out.println(date.getDate());  //19
		System.out.println(date.getHours());  //9
		//Calendar�࣬��һ��������
		//Calendar cal=new Calendar();   //�����಻��ֱ�Ӵ�����������Ҳû���޲ι���
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));  //19
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));  //10
		
		//ʹ��Spring�е�IOC�ķ�ʽ����
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//IOC����Date��
		Date d=(Date)context.getBean("date");
		System.out.println("d="+d);
		System.out.println(d.getHours());
		System.out.println(d.getYear());
		//IOC���޲ι��췽ʽ����Calendar��  --����
		//Calendar calendar=(Calendar)context.getBean("cal");
		//���лᱨ����ΪCalendar���ǳ����࣬IOC�ײ��ִ��Calendar����޲ι��죬��ֱ��new Calendar������ִ��ʱ�㱨����
		//IOC�ľ�̬������ʽ����Calendar��
		Calendar calendar=(Calendar)context.getBean("calendar");
		System.out.println(calendar.get(Calendar.YEAR));
		//IOC�ľ�̬������ʽ����Person��
		Person p1=(Person)context.getBean("p1");
		p1.eat();
		Person p2=(Person)context.getBean("p2");
		p2.eat();
		
	}
	
	/*
	 * 3��ͨ��ʵ�������ķ�ʽ��������
	 */
	@Test
	public void test03(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//����id���Ե�ֵ����ȡ����
		Calendar cal=(Calendar)context.getBean("calendar3");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//����id��ȡPerson����
		Person p3=(Person)context.getBean("person3");
		p3.eat();
		p3.say();
	}
	
	/*
	 * 4��ͨ��Spring�����ķ�ʽ��������
	 */
	@Test
	public void test04(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id����ȡ����
		Calendar cal4=(Calendar)context.getBean("calendar4");
		System.out.println(cal4.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal4.get(Calendar.HOUR_OF_DAY));
		//ͨ��id�����Person����
		Person p4=(Person)context.getBean("person4");
		p4.eat();
	}
	
	
	
	
	
	
	
	
}
