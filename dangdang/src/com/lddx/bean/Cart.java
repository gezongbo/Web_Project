package com.lddx.bean;

import java.util.ArrayList;

//���ﳵ��  --�������˼�������--���ﳵ --���������顢���ϣ�
//javabean�淶
public class Cart {
  
	//˽������
	//���ﳵʵ���Ͼ���һ��������ʹ��ArrayList��������ʾ���ﳵ����������
	private ArrayList<BookItem> itemList=new ArrayList<BookItem>();

	
	//get��set����
	public ArrayList<BookItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<BookItem> itemList) {
		this.itemList = itemList;
	}

	
	//���췽��
	public Cart(ArrayList<BookItem> itemList) {
		super();
		this.itemList = itemList;
	}

	public Cart() {
		super();
	}

	//toString����
	public String toString() {
		return "Cart [itemList=" + itemList + "]";
	}
	
	
	
}
