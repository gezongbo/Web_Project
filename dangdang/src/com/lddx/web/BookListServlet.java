package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.Book;
import com.lddx.dao.BookDao;
import com.lddx.dao.impl.BookDaoImpl;
//服务器端 -- 控制层 C
//完成核心功能：当当网首页图书查询、显示的功能
//BookListServlet定义为当当网的首页，当当网显示第1页的前5条数据
public class BookListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//请求发送过来以后，调用模型层，由模型层完成图书的查询功能
		BookDao dao=new BookDaoImpl();
		//没有进行分页查询的方法
		//ArrayList<Book> books=dao.getAllBooks();
		int start=0; //分页查询的起始下标，初始值为0，表示刚开始显示在页面上的是第1页的前5条数据
		int num=5;  //一页显示多少条数据，初始值是5，表示设置的是一页显示5条数据
		int page=1;  //第几页，初始值是1，表示第1页
		//调用带分页查询的方法
		ArrayList<Book> books=dao.getAllBooks(start, num);
		//System.out.println(books);
		
		//将模型层查询的结果，交给视图层(booklist.jsp)显示
		//将books集合放入request域中，books集合中存储的是分页查询的所有图书
		request.setAttribute("books",books);
		//将page表示的第几页放入request域中
		request.setAttribute("page", page);
		//将start表示的分页查询的下标放入request域中
		request.setAttribute("start",start);
		request.getRequestDispatcher("booklist.jsp").forward(request, response);
	}
}
