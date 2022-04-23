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


//������
public class TestDemo {

	/*
	 * �Լ��ķ�ʽ��������ʹ��set���������Ը�ֵ
	 */
	@Test
	public void test01(){
		Hero hero=new Hero();
		System.out.println(hero);
		hero.setName("��ɪ");
		hero.setAge(60);
		List<String> list=new ArrayList<String>();
		list.add("��Ұ");
		list.add("��·");
		list.add("����");
		list.add("����");
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
		d.setName("����");
		hero.setDog(d);
		System.out.println(hero);
	}
	
	/*
	 * DI����ע��--set��ʽ
	 */
	@Test
	public void test02(){
		//��ʼ��Spring����������xml�ļ�
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��id��ȡHero��
		Hero hero=(Hero)context.getBean("hero");
		System.out.println(hero);
		//Hero [age=0, jobs=null, map=null, name=null, prop=null, skills=null]
		//Hero [age=70, cat=Cat [age=2, name=��ķ], dog=Dog [age=3, name=����], jobs=[��·, ����, ��Ұ, ��Ұ], map={k1=v1, k2=v2}, name=��ɪ, prop={password=abc123, username=root}, skills=[sk1, sk2, sk3]]
	}
	
	

}
