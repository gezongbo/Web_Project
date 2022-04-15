package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lddx.bean.Order;
import com.lddx.dao.OrderDao;
import com.lddx.util.DBUtil;

//是OrderDao接口的实现子类
public class OrderDaoImpl implements OrderDao{

	//将用户id，订单时间，订单号等信息插入到d_order表中   insert into d_order...
	public void addOrderInfo(Order order) {
		try {
			Connection con=DBUtil.getCon();
			String sql="insert into d_order(user_id,order_time,order_id,total_price) values(?,?,?,?)";
			PreparedStatement prep= con.prepareStatement(sql);
			prep.setInt(1, order.getUserId());
			prep.setLong(2, order.getOrderTime());
			prep.setInt(3,order.getOrderId());
			prep.setDouble(4, order.getTotalPrice());
			//执行sql
			prep.executeUpdate();
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
