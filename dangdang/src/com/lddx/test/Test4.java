package com.lddx.test;

public class Test4 {
	public static void main(String[] args) {
		/*
		Dog dog=new Dog();
		dog.setAge(1);
		dog.setName("小黄");
		System.out.println(dog);
		
		Dog dog1=new Dog("大黄",2);
		System.out.println(dog1);
		*/
		//Dog dog3=new Dog("sss",3);
		//System.out.println(dog3);
		//this关键字的两个作用：
		//1、this表当当前类，用于区别全部变量和局部变量
		//  名字如果重名，必须使用this区分，名字如果不重复，this
		//  是可以省略的
		//2、用于当前类中构造方法的相互调用，一个构造方法中
		//   this只能调用一次
		
		//创建父类对象，和子类没有任何关系
		//Animal animal=new Animal("动物",10);
		//System.out.println(animal);
		//创建子类，默认会先执行父类的无参构造
		//Cat cat=new Cat();
		Cat cat1=new Cat("小猫","公");
		System.out.println(cat1);
		System.out.println(cat1.getAge());
		System.out.println(cat1.getName());
		//super关键字的两个作用：
		//1、在子类中使用super调用父类的属性和方法 
		//   super.xx
		//2、在子类中可以使用super调用父类的构造方法
		//   super()
		
		
	}
}
