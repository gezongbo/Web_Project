package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
import com.lddx.dao.ItemDao;
import com.lddx.util.DBUtil;

//是ItemDao的实现子类
public class ItemDaoImpl implements ItemDao{

	//将购物车中购买的所有图书插入到d_item表中
	//购物车中所购买的所有的图书都存储在了itemList集合中
	//orderId表示系统生成的订单号
	public void addItemInfo(ArrayList<BookItem> itemList,int orderId) {
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="insert into d_item(order_id,book_id,book_name,dang_price,fixed_price,book_num,amount) values(?,?,?,?,?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			//使用循环遍历itemList集合，该集合中封装了购物车中购买的所有图书，需要一条一条的取出来，在插入到数据库中
			for(BookItem bookItem:itemList){
				prep.setInt(1, orderId);
				prep.setInt(2, bookItem.getBook().getId());
				prep.setString(3, bookItem.getBook().getProductName());
				prep.setDouble(4, bookItem.getBook().getDangPrice());
				prep.setDouble(5, bookItem.getBook().getFixedPrice());
				prep.setInt(6, bookItem.getCount());
				prep.setDouble(7,bookItem.getBook().getDangPrice()*bookItem.getCount());
				//执行sql语句
				prep.executeUpdate();
			}
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
