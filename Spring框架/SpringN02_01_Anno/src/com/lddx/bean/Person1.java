package com.lddx.bean;
//@FirstAnno     //注解中的属性已经使用默认值了，可以不用强制赋值了
//@FirstAnno(value="hello")  //当只给value赋值，且名字叫value时，value=可以省略
@FirstAnno("hello")    //看到这种写法，说明hello只给value赋值了
//@Override
@SecondAnno
public class Person1 {
	//@FirstAnno
	private String name;   //私有属性--全局变量--成员变量
	//@FirstAnno
	private int age;
	
	@FirstAnno(name="ww",value="hello1")   //name不使用默认值ls，使用的是ww。其它属性使用的值是默认值
	                                       //当还有别的属性赋值时，value=是不可以省略的
	//@Override
	public Person1(){
		
	}
	
	//@FirstAnno(name="zs",cla=Person1.class,num=100,addrs={"bj","sh","sd"},value="hello2")
	//addrs在注解中是一个String类型的数组，给addrs如果赋多个值，大括号不可以省略，如果是一个值，大括号可以省略。
	//@FirstAnno(name="zs",cla=Person1.class,num=100,addrs={"sd"},value="hello2")
	@FirstAnno(name="zs",cla=Person1.class,num=100,addrs="sd",value="hello2")
	//@Override
	public void eat(/*@FirstAnno*/ String food){  //参数变量
		//@FirstAnno
		String str="a";   //局部变量
		System.out.println(str+","+food);
	}
}
