package com.lddx.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.lddx.bean.Emp;

//ģ�Ͳ�   -- dao�ӿ�
public interface EmpDao {
	//��ѯ����Ա����Ϣ�ķ���
	//public abstract ResultSet getAllEmps();
	public abstract ArrayList<Emp> getAllEmps();
	
	//��Ա����Ϣ���뵽���ݿ�ķ���
	public void addEmpInfo(Emp emp);
	
	//����id��Ա�����в�ѯ
	public abstract Emp getEmpById(int id);
	
	//����id����ɶ�һ��Ա����Ϣ���޸�
	public abstract void updateEmpById(Emp emp);
	

}
