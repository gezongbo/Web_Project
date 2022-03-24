package com.lddx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//封装JDBC连接数据库的方法
public class DBUtil {
	//获取数据库连接的方法
	public static Connection getCon() throws Exception{
		//（1）注册加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//（2）获得数据库的链接
		String url="jdbc:mysql://localhost:3306/ems";
		String user="root";
		String password="";
		Connection con=DriverManager.getConnection(url, user, password);
		//返回数据库的连接con
		return con;
	}
	
	
}
