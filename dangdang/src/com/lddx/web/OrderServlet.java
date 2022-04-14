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
import com.lddx.bean.User;
//�������˵�Servlet��
//�����ﳵҳ���н���Ĺ���
public class OrderServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//˼·��1������ҳ�������㷢�͹���������
		//System.out.println("����....");
		//    2����ȡsession����session�л�ȡuser
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		//    3�������ȡ��userΪnull,˵���㻹δ��¼��ֱ����ת����¼ҳ��login.jsp
		//      �����ȡ��user��Ϊnull,˵���Ѿ���¼���ˣ���ת��order_info.jsp,�ѹ��ﳵ����Ϣ��ʾ��ȷ�϶�����ҳ����
		if(user==null){  //δ��¼�����
			response.sendRedirect("login.jsp");
			//request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{ //�Ѿ���¼����
			//��session�л�ȡ���ﳵcart,ͨ�����ﳵ��ȡ���ﳵ��ͼ��
			Cart cart=(Cart)session.getAttribute("cart");
			//ͨ��cart���ﳵ��ü��ϣ���Ϊ�����д洢�����еĹ����ͼ��
			ArrayList<BookItem> itemList=cart.getItemList();
			//�������ܼ�
			double totalPrice=cart.getTotalPrice();
			//��totalPriceҲ����request���д洢
			request.setAttribute("totalPrice", totalPrice);
			//����˴���itemList�洢��request���У���ת�ķ�ʽֻ����ת������
			request.setAttribute("itemList", itemList);
			request.getRequestDispatcher("order_info.jsp").forward(request, response);
			
		}

		
	}
}
