package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Book;
import com.lddx.dao.BookDao;
import com.lddx.dao.impl.BookDaoImpl;
//�������� -- ���Ʋ� C
//��ɺ��Ĺ��ܣ���������ҳͼ���ѯ����ʾ�Ĺ���
//BookListServlet����Ϊ����������ҳ����������ʾ��1ҳ��ǰ5������
public class BookListServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�����͹����Ժ󣬵���ģ�Ͳ㣬��ģ�Ͳ����ͼ��Ĳ�ѯ����
		BookDao dao=new BookDaoImpl();
		//û�н��з�ҳ��ѯ�ķ���
		//ArrayList<Book> books=dao.getAllBooks();
		int start=0; //��ҳ��ѯ����ʼ�±꣬��ʼֵΪ0����ʾ�տ�ʼ��ʾ��ҳ���ϵ��ǵ�1ҳ��ǰ5������
		int num=5;  //һҳ��ʾ���������ݣ���ʼֵ��5����ʾ���õ���һҳ��ʾ5������
		int page=1;  //�ڼ�ҳ����ʼֵ��1����ʾ��1ҳ
		//���ô���ҳ��ѯ�ķ���
		ArrayList<Book> books=dao.getAllBooks(start, num);
		//System.out.println(books);
		//���û�ȡ�����������ķ���
		int count=dao.getCountByBook();
		int totalPages=count/num+1;  //��ҳ��
		
		//��ģ�Ͳ��ѯ�Ľ����������ͼ��(booklist.jsp)��ʾ
		//��books���Ϸ���request���У�books�����д洢���Ƿ�ҳ��ѯ������ͼ��
		request.setAttribute("books",books);
		//��page��ʾ�ĵڼ�ҳ����request����
		request.setAttribute("page", page);
		//��start��ʾ�ķ�ҳ��ѯ���±����request����
		request.setAttribute("start",start);
		//��totalPages��ʾ��ҳ������request����
		//request.setAttribute("totalPages",totalPages);
		//request����һ��������ʵ�ֵ���Դ������totalPages����session����ServletContext����
		HttpSession session=request.getSession();
		session.setAttribute("totalPages", totalPages);
		request.getRequestDispatcher("booklist.jsp").forward(request, response);
	}
}
