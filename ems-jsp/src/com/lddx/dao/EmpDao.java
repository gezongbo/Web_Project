package com.lddx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lddx.util.DBUtil;

//ģ�Ͳ� -- M��
//EmpDao������--��װʵ��ҵ����--���ݿ����ز���
public class EmpDao {
	//��װ������������ݿ��t_emp�����е�����  select * from t_emp
	public ResultSet getAllEmps(){
		ResultSet rs=null;
		try {
			//ͨ��DBUtil������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from t_emp";
			PreparedStatement prep=con.prepareStatement(sql);
			//ִ��sql���
			rs=prep.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
}
