package com.lddx.dao;

import java.util.ArrayList;

import com.lddx.bean.BookItem;

//封装对d_item表的操作
public interface ItemDao {
	//将购物车中购买的所有图书插入到d_item表中
	//购物车中所购买的所有的图书都存储在了itemList集合中
	//orderId表示系统生成的订单号
	public void addItemInfo(ArrayList<BookItem> itemList,int orderId);
	
	
}
