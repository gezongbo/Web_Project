package com.lddx.bean;
//���빺�ﳵ�������Ŀ�����ڹ��ﳵ��һ��һ���ĳ���
//һ�������Ŀ�ڹ��ﳵ����һ�У�һ�������Ŀ���������Ϣ��book����������count��
public class BookItem {
	private Book book;   //һ���飨���������������Ϣ��
	private int count;   //�����������
	
	//get��set����
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
	
	//���췽��
	public BookItem(Book book, int count) {
		this.book = book;
		this.count = count;
	}
	public BookItem() {
		
	}
	
	//toString����
	public String toString() {
		return "BookItem [book=" + book + ", count=" + count + "]";
	}
	
	
}
