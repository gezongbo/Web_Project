package com.lddx.bean;

import java.text.DecimalFormat;
import java.util.ArrayList;

//购物车类  --面向对象思考和设计--购物车 --容器（数组、集合）
//javabean规范
public class Cart {
  
	//私有属性
	//购物车实际上就是一个容器，使用ArrayList集合来表示购物车容器的特性
	private ArrayList<BookItem> itemList=new ArrayList<BookItem>();

	
	//完成购物车中删除一条图书条目的方法（从集合itemList中调用remove方法对应的移除掉要删除的数据）
	//id表示图书的id
	public void cartDelete(int id){
		//思路：根据传递过来的id的值，确实是要删除的哪本书
		//    购买的放在购物出的所有的图书，都是放在集合itemList中
		for(int i=0;i<itemList.size();i++){
			//item表示一条图书条目，相当于在购物车中的一整行数据，
			BookItem item=itemList.get(i);
			if(item.getBook().getId()==id){  //要删除的书的id和购物车中的已经购买的书的id相等
				//i表示的是要删除的那本书在集合中的下标
				itemList.remove(i);
			}
		}
	}
	
	//完成购物车中更改书的数量的方法
	//num表示修改的书的数量   id表示图书的id
	public void cartUpdate(int num,int id){
		for(int i=0;i<itemList.size();i++){
			BookItem item=itemList.get(i);
			if(item.getBook().getId()==id){ //条件成立，找到了要修改的图书
				item.setCount(num);
			}
		}
	}
	
	
	
	//计算购物车中所有图书的总节省金额
	//一本书的节省金额*这本书的数量，然后和购物车的每一本书累加求和
	public double getTotalSave(){
		//for(int i=0;i<itemList.size();i++){
			//BookItem item=itemList.get(i);
		//}
		double totalSave=0; //购物车总所有图书的总节省金额
		for(BookItem item:itemList){
			//item.getBook().getSaveMoney()   //一本书的节省金额
			//item.getCount()    //这本书的购买数量
			//oneItemSave表示一个图书条目节省的金额
			double oneItemSave=item.getBook().getSaveMoney()*item.getCount();
			totalSave=totalSave+oneItemSave;
		}
		DecimalFormat df=new DecimalFormat("#.##");
		String strTotalSave=df.format(totalSave);
		return Double.parseDouble(strTotalSave);
	}
	
	
	//计算购物车中所有图书的总消费金额
	public double getTotalPrice(){
		double totalPrice=0;//总金额
		for(BookItem item:itemList){
			//item.getBook().getDangPrice()   //一本书的当当价
			//item.getCount()   //这本书的购买数量
			//oneItemPrice表示一个图书条目的总消费金额
			double oneItemPrice=item.getBook().getDangPrice()*item.getCount(); 
			totalPrice=totalPrice+oneItemPrice;
		}
		DecimalFormat df=new DecimalFormat("#.##");
		String strTotalPrice=df.format(totalPrice);
		return Double.parseDouble(strTotalPrice);
	}
	
	
	
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
