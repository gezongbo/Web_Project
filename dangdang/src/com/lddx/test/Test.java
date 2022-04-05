package com.lddx.test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lddx.util.DBUtil;
import com.lddx.util.PropertiesUtil;

//������
public class Test {
	public static void main(String[] args) throws Exception {
		//Connection con=DBUtil.getCon();
		//System.out.println(con);
		
		//String value=PropertiesUtil.getProValue("myUrl");
		//System.out.println(value);
		
		//1214841600000  long���ͱ�ʾ��ʱ��
		long time=System.currentTimeMillis();
		System.out.println(time);//1649043345171
		//Date date=new Date();
		//System.out.println(date);//Mon Apr 04 11:35:45 CST 2022
		Date date1=new Date(1649043345171L);
		System.out.println(date1);//Mon Apr 04 11:35:45 CST 2022
		Date date2=new Date(1214841600000L);
		System.out.println(date2);//Tue Jul 01 00:00:00 CST 2008
		
		//�������ڸ�ʽ��ת��  SimpleDateFormat
		//yyyy��  MM��   dd��     h Hʱ   m��   s��  S����
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hhʱmm��ss��");
		String s1=sdf.format(date1);
		System.out.println(s1); //2022/04/04  2022-04-04
		String s2=sdf.format(date2);
		System.out.println(s2); //2008-07-01
		
	}
}
