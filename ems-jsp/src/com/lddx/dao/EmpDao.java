package com.lddx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lddx.util.DBUtil;

//模型层 -- M层
//EmpDao工厂类--封装实现业务功能--数据库的相关操作
public class EmpDao {
	//封装方法：获得数据库表t_emp中所有的数据  select * from t_emp
	public ResultSet getAllEmps(){
		ResultSet rs=null;
		try {
			//通过DBUtil获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from t_emp";
			PreparedStatement prep=con.prepareStatement(sql);
			//执行sql语句
			rs=prep.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
}
