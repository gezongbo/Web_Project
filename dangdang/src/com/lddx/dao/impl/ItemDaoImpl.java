package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
import com.lddx.dao.ItemDao;
import com.lddx.util.DBUtil;

//��ItemDao��ʵ������
public class ItemDaoImpl implements ItemDao{

	//�����ﳵ�й��������ͼ����뵽d_item����
	//���ﳵ������������е�ͼ�鶼�洢����itemList������
	//orderId��ʾϵͳ���ɵĶ�����
	public void addItemInfo(ArrayList<BookItem> itemList,int orderId) {
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="insert into d_item(order_id,book_id,book_name,dang_price,fixed_price,book_num,amount) values(?,?,?,?,?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			//ʹ��ѭ������itemList���ϣ��ü����з�װ�˹��ﳵ�й��������ͼ�飬��Ҫһ��һ����ȡ�������ڲ��뵽���ݿ���
			for(BookItem bookItem:itemList){
				prep.setInt(1, orderId);
				prep.setInt(2, bookItem.getBook().getId());
				prep.setString(3, bookItem.getBook().getProductName());
				prep.setDouble(4, bookItem.getBook().getDangPrice());
				prep.setDouble(5, bookItem.getBook().getFixedPrice());
				prep.setInt(6, bookItem.getCount());
				prep.setDouble(7,bookItem.getBook().getDangPrice()*bookItem.getCount());
				//ִ��sql���
				prep.executeUpdate();
			}
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
