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
	
	//�����������ʺ��������t_emp���еķ���  insert into ...
	public void addEmpInfo(String name,double salary,int age){
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql
			String sql="insert into t_emp(name,salary,age) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,name);
			prep.setDouble(2,salary);
			prep.setInt(3, age);
			//ִ��sql
			prep.executeUpdate();
			//�ر�����
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//����id����ѯһ��Ա����Ϣ�ķ���  select * from t_emp where id=?
	public ResultSet getEmpById(int id){
		ResultSet rs=null;
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from t_emp where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//ִ��sql���
			rs=prep.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	//����id���޸�һ�����ݵ���Ϣ    update t_emp set name=?,salary=?,age=? where id=?
	public void updateEmpById(int id,String name,double salary,int age){
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql
			String sql="update t_emp set name=?,salary=?,age=? where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,name);
			prep.setDouble(2,salary);
			prep.setInt(3, age);
			prep.setInt(4, id);
			//ִ��sql���
			prep.executeUpdate();
			//�ر����ݿ������
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//����id��ɾ��һ�����ݵķ���
	public void deleteEmpById(int id){
		try {
			Connection con=DBUtil.getCon();
			String sql="delete from t_emp where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			prep.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}



