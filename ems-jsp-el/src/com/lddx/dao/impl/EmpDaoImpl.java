package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.util.DBUtil;

//ģ�Ͳ�  -- daoʵ����
public class EmpDaoImpl implements EmpDao{

	//��д���ӿ��еķ���
	//��ѯ����Ա����Ϣ�ķ���
	public ArrayList<Emp> getAllEmps() {
		ArrayList<Emp> emps=new ArrayList<Emp>();//�ü����ǿյ�
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from t_emp";
			PreparedStatement prep=con.prepareStatement(sql);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			//ʹ��ѭ�����������rs�е�����
			while(rs.next()){
				//�������rs�е�����ȡ������װ��Emp������
				Emp p=new Emp();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setSalary(rs.getDouble("salary"));
				p.setAge(rs.getInt("age"));
				//��Emp������뼯��emps��
				emps.add(p);
			}
			//�ر�jdbc����ز���
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

	//��д���Ա����Ϣ�ķ���
	public void addEmpInfo(Emp emp) {
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="insert into t_emp(name,salary,age) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, emp.getName());
			prep.setDouble(2, emp.getSalary());
			prep.setInt(3, emp.getAge());
			//ִ��sql���
			prep.executeUpdate();
			//�ر�
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//��д����id��Ա����Ϣ��ѯ�ķ���
	public Emp getEmpById(int id) {
		Emp emp=new Emp();//��������û���κ���Ϣ��Ա������
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql
			String sql="select * from t_emp where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			//�������rs�е�����ȡ������װ��Emp��
			if(rs.next()){
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
			}
			//�ر�
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//��д����id��һ��Ա����Ϣ���޸�
	public void updateEmpById(Emp emp) {
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="update t_emp set name=?, salary=?, age=? where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,emp.getName());
			prep.setDouble(2,emp.getSalary());
			prep.setInt(3,emp.getAge());
			prep.setInt(4,emp.getId());
			//ִ��sql
			prep.executeUpdate();
			//�ر�
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
