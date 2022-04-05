package com.lddx.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Properties;

//读取xx.properties文件的工具类
public class PropertiesUtil {
	//封装一个读取以.properties结尾的文件的方法
	//.properties文件存储的数据是根据name,value的方式来存储的
	//调用该方法，需要传对应的name是多少，该方法返回String类型的value值
	public static String getProValue(String name) throws Exception{
		//通过流读取xx.properties文件
		//字节输入流  --是以字节的方式读文件的内容
		//File file=new File("src/db.properties");
		//File file=new File("C:\\Users\\qingd\\mywork\\tomcat\\apache-tomcat-7.0.68\\webapps\\dangdang\\WEB-INF\\classes\\db.properties");
		//InputStream in=new FileInputStream(file);
		InputStream in=PropertiesUtil.class.getResourceAsStream("/db.properties");
		//创建Properties对象
		Properties prop=new Properties();
		//将用字节流读取的文件加载进来
		prop.load(in);
		//通过Properties对象中提供的方法，可以很方便的读取.properties文件中存储的数据
		//传name，根据name获取value
		String value=prop.getProperty(name);
		return value;
	}
	
	
	
}
