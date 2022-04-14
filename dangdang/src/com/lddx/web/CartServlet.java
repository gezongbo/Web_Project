package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
//��������  -- ���Ʋ�
//��ɲ鿴���ﳵ�Ĺ���
public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//˼·��1�����յ�����ﳵ�����ӷ��͹���������
		//System.out.println("����....");
		//    2�����session,��session��ȡ�����ﳵcart
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		//System.out.println(cart);
		if(cart==null){  //û������κε�ͼ��
			request.setAttribute("itemList", null);
		}else{  //�����ͼ������
//		    3�������ﳵcart�еļ���itemList���͵�cart.jspҳ����
			//��sessionȡ���Ĺ��ﳵ��Ϊ��
			ArrayList<BookItem> itemList=cart.getItemList();
			//System.out.println("CartServlet...."+itemList);
			//ʹ��ת��
			request.setAttribute("itemList", itemList);//�����Ϸ���request�������
			double totalSave=cart.getTotalSave();
			request.setAttribute("totalSave",totalSave);//�ܽ�ʡ���
			double totalPrice=cart.getTotalPrice();
			request.setAttribute("totalPrice", totalPrice);//�����ѽ��
			
		}
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		
	}

}
