package com.lddx.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.lddx.dao.EmpDao;

//������
public class Test {
	public static void main(String[] args) throws SQLException {
		//����ģ�Ͳ�ķ���
		EmpDao dao=new EmpDao();
//		ResultSet rs=dao.getAllEmps();
//		while(rs.next()){
//			System.out.println(rs.getInt("id")+","+rs.getString("name"));
//		}
		
		dao.updateEmpById(7, "��С", 1111, 1);
		
		
	}
}
