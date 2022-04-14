package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.util.DBUtil;

//是UserDao接口的实现子类
public class UserDaoImpl implements UserDao{

	//检测邮箱是否已经被注册过
	//User返回的是null，表示邮箱可以使用
	//User返回的不是null，有内容，表示邮箱已经被注册过了
	public User checkEmailIsUse(String email) {
		User user=null;
		try {
			//获取数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from d_user where email=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,email);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			if(rs.next()){ //条件成立，说明rs结果集中有数据，邮箱在数据库中存在，邮箱已经被别人注册过了
				user=new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setNickname(rs.getString("nickname"));
				user.setPassword(rs.getString("password"));
			}
			//关闭
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	//注册时，将邮箱，昵称和密码保存到d_user表中
	public void saveUser(User user) {
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="insert into d_user(email,nickname,password) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, user.getEmail());
			prep.setString(2, user.getNickname());
			prep.setString(3, user.getPassword());
			//执行sql语句
			prep.executeUpdate();
			//关闭
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//是否可以登录功能：select * from d_user where email='abc@qq.com' and password='abc123';
	//public boolean isLogin(String email,String password);
	//User返回的如果是null，说明邮箱或者密码不正确；
	//User返回的不是null，说明邮箱和密码是正确的
	public User isLogin(String email, String password) {
		User user=null;
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from d_user where email=? and password=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, email);
			prep.setString(2, password);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				user=new User();
				user.setNickname(rs.getString("nickname"));
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
			//关闭连接
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	
	
	
	
	
}







