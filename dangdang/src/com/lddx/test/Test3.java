package com.lddx.test;

import java.util.ArrayList;

import com.lddx.bean.Cart;

public class Test3 {
	public static void main(String[] args) {
		//测试购物车
		//推一个购物车 --- 创建购物车Cart
		Cart cart=new Cart();
		ArrayList itemList=cart.getItemList();
		
		//把商品放入购物车中  -- 往itemList集合容器中存储数据
		itemList.add("饮料");
		itemList.add("书");
		itemList.add("鱼");
		
		System.out.println(itemList);  //[饮料, 书, 鱼]
		System.out.println(cart);//Cart [itemList=[饮料, 书, 鱼]]
		
	}

}
