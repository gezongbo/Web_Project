package com.lddx.bean;

import java.util.ArrayList;
import java.util.Date;

//ע���ʾ��
public class AnnoDemo {
	//@SuppressWarnings(value={ "deprecation", "unchecked" })
	@SuppressWarnings({ "deprecation", "unchecked" })
	//@SuppressWarnings("deprecation")
	//@SuppressWarnings({"deprecation"})
	//@SuppressWarnings(value={"deprecation"})
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.say();//һ��������˵....    ִ�е������say����
		          //˵....         ����û��say������ִ�е��Ǹ����say����
		//t.sleep();//���ุ�඼û��sleep����
		t.eat();
		t.myeat();
		Date date=new Date();
		System.out.println(date.getDate());
		//������ɫ����
		System.out.println(date.toLocaleString());//2022-4-22 9:21:02
		@SuppressWarnings("unused")
		ArrayList list=new ArrayList();
		
	}
}
//�ⲿ��   ����
class Person{
	//����������µİ汾����eat�����������ˣ����ǲ���ɾ�������ɾ����Ӱ���ĵط��Ĵ���
	//��eat������һ����ʱע��
	@Deprecated
	public void eat(){
		System.out.println("��...");
	}
	//eat���µ��·���
	public void myeat(){
		System.out.println("���ڳ�...");
	}
	public void say(){
		System.out.println("˵....");
	}
	//���������أ�ͬһ�����У�ͬ����ͬ��
	public void say(String name){
		
	}
}
//����  Teacher
class Teacher extends Person{
	//����������д�����say����   ͬ��ͬ��ͬ����
	//����д��ʱ�򣬲�С��say������д����sey
	//����@Overrideע���Ժ󣬾��Ǹ��߳�������ķ�ʽ����д����ķ�������������ͬ��ͬ��ͬ���ص��﷨Ҫ�󣬷��򱨴�
	@Override
	public void say() {
		System.out.println("һ��������˵....");
	}
}