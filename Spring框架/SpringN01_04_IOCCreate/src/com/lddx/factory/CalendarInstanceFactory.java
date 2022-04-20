package com.lddx.factory;

import java.util.Calendar;

//Calendar类的实例工厂
public class CalendarInstanceFactory {
	//封装一个非静态方法，获取Calendar类
	public Calendar getCalendar(){
		Calendar cal=Calendar.getInstance();
		return cal;
	}
}
