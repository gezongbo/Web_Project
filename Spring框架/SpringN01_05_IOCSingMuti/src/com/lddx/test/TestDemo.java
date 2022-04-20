package com.lddx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Cart;
import com.lddx.bean.Person;
import com.lddx.bean.Student;
import com.lddx.bean.Teacher;


//������
public class TestDemo {

	//IOC-����ģʽ������ģʽ
	@Test
	public void test01(){
		//��ʼ��Spring����
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡCart����
		//Cart cart1=(Cart)context.getBean("cart");
		//System.out.println(cart1);
		//��λ�ȡCart������ΪSpringĬ��������ǵ���ģʽ�����ܻ�ȡ���ٴΣ����ǻ�ȡ��ͬһ������
		//Cart cart2=(Cart)context.getBean("cart");
		//System.out.println(cart2);
		//Cart cart3=(Cart)context.getBean("cart");
		//System.out.println(cart3);
		//ִ�н����Cart����޲ι������1�Σ�cart1��cart2��cart3����Ľ��һ��
		//˵����Cartֻ������һ��                             ˵�����������ͬһ������
		//����Ϊ����ģʽ
		/*
		 * ����ģʽ�ĵײ�ʵ��
		 * ִ��applicationContext.xml�����ļ���<bean id="cart" class="com.lddx.bean.Cart"></bean>�Ժ�
		 * IOC�ᴴ��Cart��   Cart c=new Cart();
		 * IOC��Ѵ����Ķ������Map��     Map.put("cart",c);
		 * ����ִ��context.getBean("cart")����λ�ȡCart�����ʱ��Ĭ�ϴ�Map.get("cart")ȡ���Ķ���ͬһ������Cart����
		 * ֻ������һ�Ρ�
		 */
		
		//����ģʽ����������
		//ִ�н����Cart����޲ι��������3�Σ�cart1��cart2��cart3����Ľ������ͬ
		//      ˵��Cart��new��3��,������3������         ˵��������Ĳ���ͬһ������
		/*
		 * ����ģʽ�ĵײ�ʵ�֣�
		 * ִ��applicationContext.xml�����ļ���<bean id="cart" class="com.lddx.bean.Cart" scope="prototype"></bean>
		 * IOC��ʱֻ�����Cart�࣬������new����Cart�࣬Map������Ҳû�д洢��Cart����
		 * ����ִ��context.getBean("cart")-->Cart cart1��ʱ��IOC�ڴ�ʱ�ᴴ��Cart�ಢ����Map��,Map.put("cart",new Cart());
		 * ����ִ��context.getBean("cart")-->Cart cart2��ʱ��IOC��Map.put("cart",new Cart());
		 * ����ִ��context.getBean("cart")-->Cart cart3��ʱ��IOC��Map.put("cart",new Cart());
		 */
		
	}
	
	
	/*
	 * IOC-������
	 */
	@Test
	public void test02(){
		//��ʼ��Spring����������xx.xml�ļ�
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id����ȡPerson--Person�ǵ���ģʽ
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);
		Person p2=(Person)context.getBean("person");
		System.out.println(p2);
		/*  ����ģʽ�����������غͲ������ص����н����һ�µ�
		 * Person...�޲ι���
           com.lddx.bean.Person@1989b5
           com.lddx.bean.Person@1989b5
           Person��ֻ������һ�Σ�p1��p2��ȡ����ͬһ������
                            ����1��û�����������أ�Person...�޲ι���������������ִ����60�д����
               2�����������أ�Person...�޲ι����������������ִ����62�д����
                            ���ۣ�����������ֻ�ǰѴ��������ʱ�������Ƴ��˶���
		 */
		
		//ͨ��id����ȡCart  -- Cart�Ƕ���ģʽ
		Cart cart1=(Cart)context.getBean("cart");
		System.out.println(cart1);
		Cart cart2=(Cart)context.getBean("cart");
		System.out.println(cart2);
		/* ����ģʽ�µ�ִ�н��
		 *  Cart...�޲ι���
			com.lddx.bean.Cart@9d5793
			Cart...�޲ι���
			com.lddx.bean.Cart@b8d09d
			Cart��ÿ��ʹ��ÿ�δ�����cart1��cart2�����һ����
		 */
	}
	
	
	/*
	 *  IOC-������2
	 */
	@Test
	public void test03(){
		//��ʼ��Spring����������xml�ļ�
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡPerson��
		Person p=(Person)context.getBean("person");
		//ͨ��id��ȡTeacher��
		Teacher t=(Teacher)context.getBean("teacher");
		
	}
	
	
	/* 
	 *   Spring�����ĳ�ʼ��������
	 */
	@Test
	public void test04(){
		//��ʼ��Spring����������xml�ļ�
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡStudent��
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);
		//����close��������ʾSpring����������
		context.close();
	}
	

}
