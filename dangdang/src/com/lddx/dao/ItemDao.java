package com.lddx.dao;

import java.util.ArrayList;

import com.lddx.bean.BookItem;

//��װ��d_item��Ĳ���
public interface ItemDao {
	//�����ﳵ�й��������ͼ����뵽d_item����
	//���ﳵ������������е�ͼ�鶼�洢����itemList������
	//orderId��ʾϵͳ���ɵĶ�����
	public void addItemInfo(ArrayList<BookItem> itemList,int orderId);
	
	
}
