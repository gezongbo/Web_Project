package com.lddx.dao;

import java.util.ArrayList;

import com.lddx.bean.Book;

//服务器端  -- 模型层 M  
//BookDao接口，封装了关于d_book表的相关数据库操作
public interface BookDao {
	//获取数据库d_book表中所有的图书
	public ArrayList<Book> getAllBooks();
	//分页查询d_book表中的图书   
	//参数start是分页查询的下标，num是分页查询的数据个数
	public ArrayList<Book> getAllBooks(int start,int num);

	
	
}
