package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lddx.bean.Order;
import com.lddx.dao.OrderDao;
import com.lddx.util.DBUtil;

//��OrderDao�ӿڵ�ʵ������
public class OrderDaoImpl implements OrderDao{

	//���û�id������ʱ�䣬�����ŵ���Ϣ���뵽d_order����   insert into d_order...
	public void addOrderInfo(Order order) {
		try {
			Connection con=DBUtil.getCon();
			String sql="insert into d_order(user_id,order_time,order_id,total_price) values(?,?,?,?)";
			PreparedStatement prep= con.prepareStatement(sql);
			prep.setInt(1, order.getUserId());
			prep.setLong(2, order.getOrderTime());
			prep.setInt(3,order.getOrderId());
			prep.setDouble(4, order.getTotalPrice());
			//ִ��sql
			prep.executeUpdate();
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
