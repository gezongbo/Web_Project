package com.lddx.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.lddx.dao.EmpDao;

//测试类
public class Test {
	public static void main(String[] args) throws SQLException {
		//调用模型层的方法
		EmpDao dao=new EmpDao();
//		ResultSet rs=dao.getAllEmps();
//		while(rs.next()){
//			System.out.println(rs.getInt("id")+","+rs.getString("name"));
//		}
		
		dao.updateEmpById(7, "李小", 1111, 1);
		
		
	}
}
