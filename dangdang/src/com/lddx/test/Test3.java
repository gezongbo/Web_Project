package com.lddx.test;

import java.util.ArrayList;

import com.lddx.bean.Cart;

public class Test3 {
	public static void main(String[] args) {
		//���Թ��ﳵ
		//��һ�����ﳵ --- �������ﳵCart
		Cart cart=new Cart();
		ArrayList itemList=cart.getItemList();
		
		//����Ʒ���빺�ﳵ��  -- ��itemList���������д洢����
		itemList.add("����");
		itemList.add("��");
		itemList.add("��");
		
		System.out.println(itemList);  //[����, ��, ��]
		System.out.println(cart);//Cart [itemList=[����, ��, ��]]
		
	}

}
