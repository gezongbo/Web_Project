package com.lddx.dao;

import com.lddx.bean.User;

//UserDao封装了对d_user表中相关操作
public interface UserDao {
	//检测邮箱是否已经被注册过
	//select * from d_user where email='123@qq.com';
	//User返回的是null，表示邮箱可以使用
	//User返回的不是null，有内容，表示邮箱已经被注册过了
	public User checkEmailIsUse(String email);
	
	//注册时，将邮箱，昵称和密码保存到d_user表中
	//insert into d_user values(???....);
	public void saveUser(User user);
	
}
