package com.lddx.test;

import java.util.ArrayList;

import com.lddx.bean.Book;
import com.lddx.dao.BookDao;
import com.lddx.dao.impl.BookDaoImpl;

public class Test1 {
	public static void main(String[] args) {
		/*
		BookDao dao=new BookDaoImpl();
		ArrayList<Book> books=dao.getAllBooks();
		System.out.println(books);
		*/
		Student stu=new Student();
		stu.study(100);
		stu.study("aaa", 20);
		stu.eat("");  //����eat����
		Person p=new Student();
		p.eat("");  ////����eat����
		Person p1=new Person();
		p1.eat("");//����...eat����
	}

}
