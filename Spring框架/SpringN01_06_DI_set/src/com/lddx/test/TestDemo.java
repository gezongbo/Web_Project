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
	 * 自己的方式创建对象并使用set方法对属性赋值
	 */
	@Test
	public void test01(){
		Hero hero=new Hero();
		System.out.println(hero);
		hero.setName("亚瑟");
		hero.setAge(60);
		List<String> list=new ArrayList<String>();
		list.add("打野");
		list.add("边路");
		list.add("辅助");
		list.add("辅助");
		hero.setJobs(list);
		Set<String> set=new HashSet<String>();
		set.add("sk1");
		set.add("sk2");
		set.add("sk3");
		set.add("sk3");
		hero.setSkills(set);
		Map<String,String> map=new HashMap<String,String>();
		map.put("s1", "v1");
		map.put("s2", "v2");
		hero.setMap(map);
		Properties prop=new Properties();
		prop.setProperty("name", "root");
		prop.setProperty("pwd", "123456");
		hero.setProp(prop);
		Dog d=new Dog();
		d.setAge(5);
		d.setName("旺财");
		hero.setDog(d);
		System.out.println(hero);
	}
	
	/*
	 * DI依赖注入--set方式
	 */
	@Test
	public void test02(){
		//初始化Spring容器，解析xml文件
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id获取Hero类
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		//Hero [age=0, jobs=null, map=null, name=null, prop=null, skills=null]
		//Hero [age=70, cat=Cat [age=2, name=汤姆], dog=Dog [age=3, name=旺财], jobs=[边路, 辅助, 打野, 打野], map={k1=v1, k2=v2}, name=亚瑟, prop={password=abc123, username=root}, skills=[sk1, sk2, sk3]]
	}
	
	

}
