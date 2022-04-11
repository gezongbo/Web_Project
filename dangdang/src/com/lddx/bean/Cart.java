package com.lddx.bean;

import java.util.ArrayList;

//购物车类  --面向对象思考和设计--购物车 --容器（数组、集合）
//javabean规范
public class Cart {
  
	//私有属性
	//购物车实际上就是一个容器，使用ArrayList集合来表示购物车容器的特性
	private ArrayList<BookItem> itemList=new ArrayList<BookItem>();

	
	//get和set方法
	public ArrayList<BookItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<BookItem> itemList) {
		this.itemList = itemList;
	}

	
	//构造方法
	public Cart(ArrayList<BookItem> itemList) {
		super();
		this.itemList = itemList;
	}

	public Cart() {
		super();
	}

	//toString方法
	public String toString() {
		return "Cart [itemList=" + itemList + "]";
	}
	
	
	
}
