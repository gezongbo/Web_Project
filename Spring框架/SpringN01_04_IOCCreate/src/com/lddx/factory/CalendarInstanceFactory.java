package com.lddx.factory;

import java.util.Calendar;

//Calendar���ʵ������
public class CalendarInstanceFactory {
	//��װһ���Ǿ�̬��������ȡCalendar��
	public Calendar getCalendar(){
		Calendar cal=Calendar.getInstance();
		return cal;
	}
}
