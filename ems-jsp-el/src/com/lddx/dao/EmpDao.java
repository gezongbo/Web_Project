package com.lddx.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.lddx.bean.Emp;

//模型层   -- dao接口
public interface EmpDao {
	//查询所有员工信息的方法
	//public abstract ResultSet getAllEmps();
	public abstract ArrayList<Emp> getAllEmps();
	
	//将员工信息插入到数据库的方法
	public void addEmpInfo(Emp emp);
	
	//根据id对员工进行查询
	public abstract Emp getEmpById(int id);
	
	//根据id来完成对一条员工信息的修改
	public abstract void updateEmpById(Emp emp);
	

}
