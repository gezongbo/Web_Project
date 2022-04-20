package com.lddx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lddx.bean.Cart;
import com.lddx.bean.Person;
import com.lddx.bean.Student;
import com.lddx.bean.Teacher;


//测试类
public class TestDemo {

	//IOC-单例模式、多例模式
	@Test
	public void test01(){
		//初始化Spring容器
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Cart对象
		//Cart cart1=(Cart)context.getBean("cart");
		//System.out.println(cart1);
		//多次获取Cart对象，因为Spring默认情况下是单例模式，不管获取多少次，都是获取的同一个对象
		//Cart cart2=(Cart)context.getBean("cart");
		//System.out.println(cart2);
		//Cart cart3=(Cart)context.getBean("cart");
		//System.out.println(cart3);
		//执行结果：Cart类的无参构造输出1次，cart1、cart2和cart3输出的结果一致
		//说明：Cart只创建了一次                             说明：输出的是同一个对象
		//以上为单例模式
		/*
		 * 单例模式的底层实现
		 * 执行applicationContext.xml配置文件中<bean id="cart" class="com.lddx.bean.Cart"></bean>以后
		 * IOC会创建Cart类   Cart c=new Cart();
		 * IOC会把创建的对象放入Map中     Map.put("cart",c);
		 * 代码执行context.getBean("cart")来多次获取Cart对象的时候，默认从Map.get("cart")取出的都是同一个对象，Cart对象
		 * 只创建了一次。
		 */
		
		//多例模式的输出结果：
		//执行结果：Cart类的无参构造输出了3次，cart1、cart2和cart3输出的结果都不同
		//      说明Cart类new了3次,创建了3个对象         说明：输出的不是同一个对象
		/*
		 * 多例模式的底层实现：
		 * 执行applicationContext.xml配置文件中<bean id="cart" class="com.lddx.bean.Cart" scope="prototype"></bean>
		 * IOC此时只会管理Cart类，并不会new创建Cart类，Map集合中也没有存储的Cart对象
		 * 代码执行context.getBean("cart")-->Cart cart1的时候，IOC在此时会创建Cart类并放入Map中,Map.put("cart",new Cart());
		 * 代码执行context.getBean("cart")-->Cart cart2的时候，IOC：Map.put("cart",new Cart());
		 * 代码执行context.getBean("cart")-->Cart cart3的时候，IOC：Map.put("cart",new Cart());
		 */
		
	}
	
	
	/*
	 * IOC-懒加载
	 */
	@Test
	public void test02(){
		//初始化Spring容器，解析xx.xml文件
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id来获取Person--Person是单例模式
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);
		Person p2=(Person)context.getBean("person");
		System.out.println(p2);
		/*  单例模式，设置懒加载和不懒加载的运行结果是一致的
		 * Person...无参构造
           com.lddx.bean.Person@1989b5
           com.lddx.bean.Person@1989b5
           Person类只创建了一次，p1和p2获取的是同一个对象
                            区别：1、没有设置懒加载，Person...无参构造的输出内容是在执行完60行代码后
               2、设置懒加载，Person...无参构造的输入内容是在执行完62行代码后
                            结论：所以懒加载只是把创建对象的时间往后推迟了而已
		 */
		
		//通过id来获取Cart  -- Cart是多例模式
		Cart cart1=(Cart)context.getBean("cart");
		System.out.println(cart1);
		Cart cart2=(Cart)context.getBean("cart");
		System.out.println(cart2);
		/* 多例模式下的执行结果
		 *  Cart...无参构造
			com.lddx.bean.Cart@9d5793
			Cart...无参构造
			com.lddx.bean.Cart@b8d09d
			Cart类每次使用每次创建，cart1和cart2结果不一样的
		 */
	}
	
	
	/*
	 *  IOC-懒加载2
	 */
	@Test
	public void test03(){
		//初始化Spring容器，解析xml文件
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Person类
		Person p=(Person)context.getBean("person");
		//通过id获取Teacher类
		Teacher t=(Teacher)context.getBean("teacher");
		
	}
	
	
	/* 
	 *   Spring容器的初始化和销毁
	 */
	@Test
	public void test04(){
		//初始化Spring容器，解析xml文件
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Student类
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);
		//调用close方法，表示Spring容器的销毁
		context.close();
	}
	

}
