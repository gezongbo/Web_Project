package com.lddx.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//英雄类--javabean--对象
public class Hero {
	//私有属性
	private String name;
	private int age;
	private List<String> jobs;
	private Set<String> skills;  
	private Map<String,String> map;
	private Properties prop;
	private Dog dog;
	private Cat cat;
	
	//get和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getJobs() {
		return jobs;
	}
	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	//构造方法
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Hero(String name, int age, List<String> jobs, Set<String> skills,
			Map<String, String> map, Properties prop, Dog dog, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.jobs = jobs;
		this.skills = skills;
		this.map = map;
		this.prop = prop;
		this.dog = dog;
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Hero [age=" + age + ", cat=" + cat + ", dog=" + dog + ", jobs="
				+ jobs + ", map=" + map + ", name=" + name + ", prop=" + prop
				+ ", skills=" + skills + "]";
	}
	
	

	
	
	
}
