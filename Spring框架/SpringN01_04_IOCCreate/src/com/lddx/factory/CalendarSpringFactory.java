package com.lddx.factory;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

//Calendar类的Spring工厂，让该类实现FactoryBean
public class CalendarSpringFactory implements FactoryBean<Calendar>{

	//获取对象
	public Calendar getObject() throws Exception {
		Calendar cal=Calendar.getInstance();
		return cal;
	}

	//获取对象的类型
	public Class<?> getObjectType() {
		return Calendar.class;
	}

	//当前对象是否是一个单例模式
	//例子：一个对象获取多次如果还是同一个对象，这就是单例模式；一个对象每次获取都是一个新对象，这就是多例模式
	public boolean isSingleton() {
		return true;     //返回true表示单例模式
	}

}
