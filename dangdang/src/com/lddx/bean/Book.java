package com.lddx.bean;
//ģ�Ͳ�
//������������
//javabean�ࣺ��Ӧ���ݿ�d_book���е��ֶ�   
public class Book {
	//˽������
	private int id;  //����
	private String productName;//����
	private String description; //��ļ��
	private double fixedPrice;  //�г���
	private double dangPrice;  //������
	private String productPic; //���ͼƬ
	private String author;  //����
	private String publishing; //������
	private String publishTime; //����ʱ�� 
	private double saveMoney;  //��ʡ���,�����Ժ�d_book���е��ֶ�û�ж�Ӧ
	
	//��ӵ�get��set����
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
	
	//��ӹ��췽��
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
	
	//���toString����
	public String toString() {
		/*
		return "Book [author=" + author + ", dangPrice=" + dangPrice
				+ ", description=" + description + ", fixedPrice=" + fixedPrice
				+ ", id=" + id + ", productName=" + productName
				+ ", productPic=" + productPic + ", publishTime=" + publishTime
				+ ", publishing=" + publishing + "]";*/
				
		return "["+id+"-"+productName+"]";
	}
	
	
	
}
