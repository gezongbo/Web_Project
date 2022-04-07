package com.lddx.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import com.lddx.bean.Book;
import com.lddx.dao.BookDao;
import com.lddx.dao.impl.BookDaoImpl;
import com.lddx.util.CodeUtil;

public class Test1 {
	public static void main(String[] args) {
		//String[] cs=CodeUtil.createCode();
		//System.out.println(Arrays.toString(cs));
		//String strCode=CodeUtil.createCode();
		//System.out.println(strCode);
		HashSet<String> set=new HashSet<String>();
		set.add("3");
		set.add("1");
		set.add("1");
		set.add("A");
		set.add("A");
		set.add("B");
		System.out.println(set);//[3, 1, A, B]
		System.out.println(set.size());
		//set  [3,1,A,B]
		//itr  [3,1,A,B]
		//Iterator迭代器
		Iterator<String> itr=set.iterator();
		String strCode="";
		while(itr.hasNext()){
			String s=itr.next();
			strCode=strCode+s;
		}
		System.out.println(strCode);
		
		/*
		BookDao dao=new BookDaoImpl();
		ArrayList<Book> books=dao.getAllBooks();
		System.out.println(books);
		*/
//		Student stu=new Student();
//		stu.study(100);
//		stu.study("aaa", 20);
//		stu.eat("");  //子类eat方法
//		Person p=new Student();
//		p.eat("");  ////子类eat方法
//		Person p1=new Person();
//		p1.eat("");//父类...eat方法
		
//		BookDao dao=new BookDaoImpl();
//		int count=dao.getCountByBook();
//		System.out.println(count/5+1);
	}

}
