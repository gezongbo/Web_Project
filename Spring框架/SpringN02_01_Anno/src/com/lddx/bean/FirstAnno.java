package com.lddx.bean;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义一个注解，注解名为FirstAnno
@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FirstAnno {
	
	//属性   注解中定义属性等同于接口中定义方法
	public String name() default "ls";
	Class cla() default String.class;
	int num() default 50;
	//Date date();   Date类型不可以在注解中定义
	String[] addrs() default {"a","b","c","d"};
	String value();   //属性名叫value，value没有默认值
	
	//可以用注解作为属性的类型
	//SecondAnno sa();
	
}
