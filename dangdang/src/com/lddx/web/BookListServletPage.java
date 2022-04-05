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
//该Servlet执行的功能：处理当当网首页，上一页和下一页的功能
public class BookListServletPage extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//第几页的参数
		String strPage=request.getParameter("page");
		//查询下标的参数
		String strStart=request.getParameter("start");
		//接收参数a，a的值用于区分是上一页还是下一页
		String strA=request.getParameter("a");
		
		//System.out.println(strPage);
		int page=Integer.parseInt(strPage);
		int start=Integer.parseInt(strStart);
		int a=Integer.parseInt(strA);
		if(a==0){  //上一页
			page--;
			start-=5;
		}
		if(a==1){  //下一页
			page++;
			start=start+5;
		}
		
		//int start=5;
		int num=5;
		//int page=2;
		//调用模型层
		BookDao dao=new BookDaoImpl();
		ArrayList<Book> books=dao.getAllBooks(start, num);
		
		
		//跳转视图层
		request.setAttribute("books", books);
		request.setAttribute("page", page);
		request.setAttribute("start", start);
		request.getRequestDispatcher("booklist.jsp").forward(request, response);
	}

}
