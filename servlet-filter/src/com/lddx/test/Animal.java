package com.lddx.test;

public abstract class Animal {
	public abstract void shout();
	//public void shout1();
	
	public void huxi(){
		System.out.println("Animal类中的huxi方法....");
	}
	//抽象类中可以包含普通方法，也可以包含抽象方法，可以全是普通方法，也可以全是抽象
	//有抽象方法的类一定是抽象类
	
	//接口是一种特殊的抽象类，接口中的方法全是抽象方法，不可以包含普通方法
}
