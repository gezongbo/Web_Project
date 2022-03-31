package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.util.DBUtil;

//模型层  -- dao实现类
public class EmpDaoImpl implements EmpDao{

	//重写父接口中的方法
	//查询所有员工信息的方法
	public ArrayList<Emp> getAllEmps() {
		ArrayList<Emp> emps=new ArrayList<Emp>();//该集合是空的
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from t_emp";
			PreparedStatement prep=con.prepareStatement(sql);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			//使用循环遍历结果集rs中的数据
			while(rs.next()){
				//将结果集rs中的数据取出，封装到Emp对象里
				Emp p=new Emp();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setSalary(rs.getDouble("salary"));
				p.setAge(rs.getInt("age"));
				//将Emp对象放入集合emps中
				emps.add(p);
			}
			//关闭jdbc的相关操作
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

	//重写添加员工信息的方法
	public void addEmpInfo(Emp emp) {
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="insert into t_emp(name,salary,age) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, emp.getName());
			prep.setDouble(2, emp.getSalary());
			prep.setInt(3, emp.getAge());
			//执行sql语句
			prep.executeUpdate();
			//关闭
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//重写根据id对员工信息查询的方法
	public Emp getEmpById(int id) {
		Emp emp=new Emp();//创建的是没有任何信息的员工对象
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql
			String sql="select * from t_emp where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			//将结果集rs中的数据取出，封装到Emp中
			if(rs.next()){
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
			}
			//关闭
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//重写根据id对一条员工信息的修改
	public void updateEmpById(Emp emp) {
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="update t_emp set name=?, salary=?, age=? where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,emp.getName());
			prep.setDouble(2,emp.getSalary());
			prep.setInt(3,emp.getAge());
			prep.setInt(4,emp.getId());
			//执行sql
			prep.executeUpdate();
			//关闭
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
