package com.lddx.bean;
//放入购物车的书的条目，会在购物车中一条一条的出现
//一个书的条目在购物车出现一行，一个书的条目包含书的信息（book）和数量（count）
public class BookItem {
	private Book book;   //一本书（包含了书的所有信息）
	private int count;   //购买书的数量
	
	//get和set方法
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//构造方法
	public BookItem(Book book, int count) {
		this.book = book;
		this.count = count;
	}
	public BookItem() {
		
	}
	
	//toString方法
	public String toString() {
		return "BookItem [book=" + book + ", count=" + count + "]";
	}
	
	
}
