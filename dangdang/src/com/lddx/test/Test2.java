package com.lddx.test;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.dao.impl.UserDaoImpl;

public class Test2 {
	public static void main(String[] args) {
		UserDao dao=new UserDaoImpl();
		User user=dao.checkEmailIsUse("ls@126.com");
		System.out.println(user);
	}

}
