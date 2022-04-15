package com.lddx.bean;
//javabean类  == d_item表
public class Item {
	private int id;  //主键
	private int orderId; //订单号
	private int bookId;  //图书的id
	private String bookName; //书名
	private double dangPrice;//当当价格
	private double fixedPrice; //市场价格
	private int bookNum;  //购买书的数量
	private double amount; //小计=当当价格*数量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}
	public double getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Item(int id, int orderId, int bookId, String bookName,
			double dangPrice, double fixedPrice, int bookNum, double amount) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.dangPrice = dangPrice;
		this.fixedPrice = fixedPrice;
		this.bookNum = bookNum;
		this.amount = amount;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [amount=" + amount + ", bookId=" + bookId + ", bookName="
				+ bookName + ", bookNum=" + bookNum + ", dangPrice="
				+ dangPrice + ", fixedPrice=" + fixedPrice + ", id=" + id
				+ ", orderId=" + orderId + "]";
	}
	
	
	
}
