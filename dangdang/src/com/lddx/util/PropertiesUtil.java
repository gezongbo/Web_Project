package com.lddx.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Properties;

//��ȡxx.properties�ļ��Ĺ�����
public class PropertiesUtil {
	//��װһ����ȡ��.properties��β���ļ��ķ���
	//.properties�ļ��洢�������Ǹ���name,value�ķ�ʽ���洢��
	//���ø÷�������Ҫ����Ӧ��name�Ƕ��٣��÷�������String���͵�valueֵ
	public static String getProValue(String name) throws Exception{
		//ͨ������ȡxx.properties�ļ�
		//�ֽ�������  --�����ֽڵķ�ʽ���ļ�������
		//File file=new File("src/db.properties");
		//File file=new File("C:\\Users\\qingd\\mywork\\tomcat\\apache-tomcat-7.0.68\\webapps\\dangdang\\WEB-INF\\classes\\db.properties");
		//InputStream in=new FileInputStream(file);
		InputStream in=PropertiesUtil.class.getResourceAsStream("/db.properties");
		//����Properties����
		Properties prop=new Properties();
		//�����ֽ�����ȡ���ļ����ؽ���
		prop.load(in);
		//ͨ��Properties�������ṩ�ķ��������Ժܷ���Ķ�ȡ.properties�ļ��д洢������
		//��name������name��ȡvalue
		String value=prop.getProperty(name);
		return value;
	}
	
	
	
}
