package com.lddx.factory;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

//Calendar���Spring�������ø���ʵ��FactoryBean
public class CalendarSpringFactory implements FactoryBean<Calendar>{

	//��ȡ����
	public Calendar getObject() throws Exception {
		Calendar cal=Calendar.getInstance();
		return cal;
	}

	//��ȡ���������
	public Class<?> getObjectType() {
		return Calendar.class;
	}

	//��ǰ�����Ƿ���һ������ģʽ
	//���ӣ�һ�������ȡ����������ͬһ����������ǵ���ģʽ��һ������ÿ�λ�ȡ����һ���¶�������Ƕ���ģʽ
	public boolean isSingleton() {
		return true;     //����true��ʾ����ģʽ
	}

}
