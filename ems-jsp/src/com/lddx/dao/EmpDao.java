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
	
	//将姓名、工资和年龄插入t_emp表中的方法  insert into ...
	public void addEmpInfo(String name,double salary,int age){
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql
			String sql="insert into t_emp(name,salary,age) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,name);
			prep.setDouble(2,salary);
			prep.setInt(3, age);
			//执行sql
			prep.executeUpdate();
			//关闭连接
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//根据id来查询一条员工信息的方法  select * from t_emp where id=?
	public ResultSet getEmpById(int id){
		ResultSet rs=null;
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from t_emp where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//执行sql语句
			rs=prep.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	//根据id来修改一条数据的信息    update t_emp set name=?,salary=?,age=? where id=?
	public void updateEmpById(int id,String name,double salary,int age){
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql
			String sql="update t_emp set name=?,salary=?,age=? where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,name);
			prep.setDouble(2,salary);
			prep.setInt(3, age);
			prep.setInt(4, id);
			//执行sql语句
			prep.executeUpdate();
			//关闭数据库的连接
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}



