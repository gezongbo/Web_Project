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
import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
import com.lddx.dao.BookDao;
import com.lddx.dao.impl.BookDaoImpl;
//�������ܵ�Servlet
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡajax���������еĲ���
		String strId=request.getParameter("idData");
		//System.out.println(strId);
		
		//˼·��1������ģ�Ͳ㣬��ģ�Ͳ����id����Ӧ�������Ϣ��ѯ���� -->Book
		//    2������Session,�������ﳵCart,��ģ�Ͳ��ѯ��������Book������1���빺�ﳵ�У����ﳵҪ����session�д洢
		//    3���ж��ǵ�һ�ι������Ѿ�������ˣ����������Ϣ�����������  ***
		
		BookDao dao=new BookDaoImpl();
		Book book=dao.getBookById(Integer.parseInt(strId));
		//System.out.println(book);
		
		int index=0;  //���أ������Ƿ���Թ���ͼ��Ŀ��أ����index=0��ʾ���Թ���
		//���index=-1��ʾ�����Թ���
		
		HttpSession session=request.getSession();
		//���ﳵ,ÿһ����ɹ��򣬶��Ǵ���һ���µĹ��ﳵ
		//Cart cart=new Cart();
		//��sessionֱ��ȡ���ﳵcart�������session����ȡ��������Ϊ�գ�˵�����ǵ�һ�ι��������session��ȡ���ﳵcart��
		//ȡ�������ǿգ�˵���ǵ�һ�ι�����Ҫ�������ﳵ��
		Cart cart=(Cart)session.getAttribute("cart");
		//System.out.println("ǰ:"+cart);
		if(cart==null){  //���cart��null,˵���ǵ�һ�ε������
			//����һ���µĹ��ﳵ������session
			session.setAttribute("cart", new Cart());
			//�����´�sessionȡ�����ﳵ
			cart=(Cart)session.getAttribute("cart");
		}else{ //�ڹ��ﳵ��Ϊ�յ�����£��жϹ��ﳵ���Ƿ����Ѿ��������ͼ����
			ArrayList<BookItem> itemList=cart.getItemList();//��ȡ���ﳵ�еļ�������
			//ʹ��ѭ������itemList���ϣ���һ�¸ü������Ƿ����Ѿ��������ͼ��
			for(BookItem item:itemList){
				//�����ļ����е����id�Ͳ������ݹ�����strId�Ƚϣ������ȣ�˵�����ﳵ���Ѿ�����Ҫ����Ȿ����
				if(item.getBook().getId()==Integer.parseInt(strId)){
					index=-1;
				}
			}
		}
		
		//��ɹ���Ĵ���
		if(index==0){  //���ص���0�����Թ��򣻿��ص���-1�������Թ���
			//cart��Ϊ�յ��������Ҫ�����������������빺�ﳵ�У����ﳵ�����·���session��
			ArrayList<BookItem> itemList=cart.getItemList();
			//����һ��ͼ����Ŀ��������1������book
			BookItem item=new BookItem(book,1);
			//��ͼ����Ŀ���빺�ﳵ�еļ�����
			itemList.add(item);
			//�����ﳵ����session�д洢
			session.setAttribute("cart",cart);
		}
	
		//System.out.println("��:"+cart);
		//����indexȡֵ���ж��Ƿ���ɹ�
		PrintWriter pw=response.getWriter();
		if(index==0){   //����ɹ���
			pw.write("0");
		}else if(index==-1){  //δ����ɹ�
			pw.write("-1");
		}
			
		
		
	}

}





