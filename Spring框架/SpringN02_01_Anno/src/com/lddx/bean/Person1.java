package com.lddx.bean;
//@FirstAnno     //ע���е������Ѿ�ʹ��Ĭ��ֵ�ˣ����Բ���ǿ�Ƹ�ֵ��
//@FirstAnno(value="hello")  //��ֻ��value��ֵ�������ֽ�valueʱ��value=����ʡ��
@FirstAnno("hello")    //��������д����˵��helloֻ��value��ֵ��
//@Override
@SecondAnno
public class Person1 {
	//@FirstAnno
	private String name;   //˽������--ȫ�ֱ���--��Ա����
	//@FirstAnno
	private int age;
	
	@FirstAnno(name="ww",value="hello1")   //name��ʹ��Ĭ��ֵls��ʹ�õ���ww����������ʹ�õ�ֵ��Ĭ��ֵ
	                                       //�����б�����Ը�ֵʱ��value=�ǲ�����ʡ�Ե�
	//@Override
	public Person1(){
		
	}
	
	//@FirstAnno(name="zs",cla=Person1.class,num=100,addrs={"bj","sh","sd"},value="hello2")
	//addrs��ע������һ��String���͵����飬��addrs��������ֵ�������Ų�����ʡ�ԣ������һ��ֵ�������ſ���ʡ�ԡ�
	//@FirstAnno(name="zs",cla=Person1.class,num=100,addrs={"sd"},value="hello2")
	@FirstAnno(name="zs",cla=Person1.class,num=100,addrs="sd",value="hello2")
	//@Override
	public void eat(/*@FirstAnno*/ String food){  //��������
		//@FirstAnno
		String str="a";   //�ֲ�����
		System.out.println(str+","+food);
	}
}
