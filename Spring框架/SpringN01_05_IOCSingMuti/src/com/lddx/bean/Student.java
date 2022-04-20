package com.lddx.bean;

public class Student {

	//无参构造方法
	public Student() {
		System.out.println("Student...无参构造");
	}
	
	//想让Spring容器在初始化的时候执行
	//封装一个初始化操作的方法--方法名自定义
	public void myInitFunc(){
		System.out.println("创建....数据库打开了...");
	}
	
	//想让Spring容器在销毁的时候执行
	//封装一个销毁操作的方法--方法名自定义
	public void myDestoryFunc(){
		System.out.println("关闭...释放资源...");
	}
	
	
}
