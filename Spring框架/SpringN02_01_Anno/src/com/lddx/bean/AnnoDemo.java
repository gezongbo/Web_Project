package com.lddx.bean;

import java.util.ArrayList;
import java.util.Date;

//注解的示例
public class AnnoDemo {
	//@SuppressWarnings(value={ "deprecation", "unchecked" })
	@SuppressWarnings({ "deprecation", "unchecked" })
	//@SuppressWarnings("deprecation")
	//@SuppressWarnings({"deprecation"})
	//@SuppressWarnings(value={"deprecation"})
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.say();//一本正经的说....    执行的子类的say方法
		          //说....         子类没有say方法，执行的是父类的say方法
		//t.sleep();//子类父类都没有sleep方法
		t.eat();
		t.myeat();
		Date date=new Date();
		System.out.println(date.getDate());
		//消除黄色警告
		System.out.println(date.toLocaleString());//2022-4-22 9:21:02
		@SuppressWarnings("unused")
		ArrayList list=new ArrayList();
		
	}
}
//外部类   父类
class Person{
	//假设更新了新的版本，该eat方法不想用了，但是不能删除，如果删除会影响别的地方的代码
	//给eat方法加一个过时注解
	@Deprecated
	public void eat(){
		System.out.println("吃...");
	}
	//eat更新的新方法
	public void myeat(){
		System.out.println("我在吃...");
	}
	public void say(){
		System.out.println("说....");
	}
	//方法的重载：同一个类中，同名不同参
	public void say(String name){
		
	}
}
//子类  Teacher
class Teacher extends Person{
	//在子类中重写父类的say方法   同名同参同返回
	//在重写的时候，不小心say方法名写成了sey
	//加上@Override注解以后，就是告诉程序下面的方式是重写父类的方法，必须遵守同名同参同返回的语法要求，否则报错
	@Override
	public void say() {
		System.out.println("一本正经的说....");
	}
}