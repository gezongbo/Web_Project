package com.lddx.bean;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�Զ���һ��ע�⣬ע����ΪFirstAnno
@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FirstAnno {
	
	//����   ע���ж������Ե�ͬ�ڽӿ��ж��巽��
	public String name() default "ls";
	Class cla() default String.class;
	int num() default 50;
	//Date date();   Date���Ͳ�������ע���ж���
	String[] addrs() default {"a","b","c","d"};
	String value();   //��������value��valueû��Ĭ��ֵ
	
	//������ע����Ϊ���Ե�����
	//SecondAnno sa();
	
}
