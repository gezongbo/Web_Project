package com.lddx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//��װJDBC�������ݿ�ķ���
public class DBUtil {
	//��ȡ���ݿ����ӵķ���
	public static Connection getCon() throws Exception{
		//��1��ע���������
		Class.forName("com.mysql.jdbc.Driver");
		//��2��������ݿ������
		String url="jdbc:mysql://localhost:3306/ems";
		String user="root";
		String password="";
		Connection con=DriverManager.getConnection(url, user, password);
		//�������ݿ������con
		return con;
	}
	
	
}
