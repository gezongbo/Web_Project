package com.lddx.bean;
//模型层
//面向对象：书对象
//javabean类：对应数据库d_book表中的字段   
public class Book {
	//私有属性
	private int id;  //主键
	private String productName;//书名
	private String description; //书的简介
	private double fixedPrice;  //市场价
	private double dangPrice;  //当当价
	private String productPic; //书的图片
	private String author;  //作者
	private String publishing; //出版社
	private String publishTime; //出版时间 
	private double saveMoney;  //节省金额,此属性和d_book表中的字段没有对应
	
	//添加的get和set方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public double getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}
	public String getProductPic() {
		return productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	
	public double getSaveMoney() {
		return saveMoney;
	}
	public void setSaveMoney(double saveMoney) {
		this.saveMoney = saveMoney;
	}
	
	//添加构造方法
	public Book() {
		super();
	}
	
	public Book(int id, String productName, String description,
			double fixedPrice, double dangPrice, String productPic,
			String author, String publishing, String publishTime,
			double saveMoney) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.fixedPrice = fixedPrice;
		this.dangPrice = dangPrice;
		this.productPic = productPic;
		this.author = author;
		this.publishing = publishing;
		this.publishTime = publishTime;
		this.saveMoney = saveMoney;
	}
	
	
	public Book(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
	}
	
	//添加toString方法
	public String toString() {
		/*
		return "Book [author=" + author + ", dangPrice=" + dangPrice
				+ ", description=" + description + ", fixedPrice=" + fixedPrice
				+ ", id=" + id + ", productName=" + productName
				+ ", productPic=" + productPic + ", publishTime=" + publishTime
				+ ", publishing=" + publishing + "]";
				*/
		return "["+id+"-"+productName+"]";
	}
	
	
	
}
