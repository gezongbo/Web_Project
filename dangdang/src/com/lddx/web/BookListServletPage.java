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
//��Servletִ�еĹ��ܣ�����������ҳ����һҳ����һҳ�Ĺ���
public class BookListServletPage extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�ڼ�ҳ�Ĳ���
		String strPage=request.getParameter("page");
		//��ѯ�±�Ĳ���
		String strStart=request.getParameter("start");
		//���ղ���a��a��ֵ������������һҳ������һҳ
		String strA=request.getParameter("a");
		
		//System.out.println(strPage);
		int page=Integer.parseInt(strPage);
		int start=Integer.parseInt(strStart);
		int a=Integer.parseInt(strA);
		if(a==0){  //��һҳ
			page--;
			start-=5;
		}
		if(a==1){  //��һҳ
			page++;
			start=start+5;
		}
		
		//int start=5;
		int num=5;
		//int page=2;
		//����ģ�Ͳ�
		BookDao dao=new BookDaoImpl();
		ArrayList<Book> books=dao.getAllBooks(start, num);
		
		
		//��ת��ͼ��
		request.setAttribute("books", books);
		request.setAttribute("page", page);
		request.setAttribute("start", start);
		request.getRequestDispatcher("booklist.jsp").forward(request, response);
	}

}
