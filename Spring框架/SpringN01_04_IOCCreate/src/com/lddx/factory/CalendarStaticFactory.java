package com.lddx.factory;

import java.util.Calendar;

//Calendar类的静态工厂
public class CalendarStaticFactory {
	//封装一个获取Calendar类的静态方法
	public static Calendar getCanendar(){
		Calendar calendar=Calendar.getInstance();
		return calendar;
	}
	
	
}
