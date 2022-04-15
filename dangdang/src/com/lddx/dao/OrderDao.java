package com.lddx.dao;

import com.lddx.bean.Order;

//封装对d_order表的操作
public interface OrderDao {

	//将用户id，订单时间，订单号等信息插入到d_order表中
	public void addOrderInfo(Order order);
	
	
}
