package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Cart;
//�������˵�һ��Servlet
//��ɹ��ﳵ��ɾ���Ĺ���
public class CartDeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//˼·��1�����չ��ﳵ�е��ɾ��������ͬʱ���������д��ݹ����Ĳ���
		String strId=request.getParameter("id");
		System.out.println(strId);
		//    2����ȡsession����session��ȡ���ﳵcart��ͨ�����ﳵ����cartDelete�������ͼ���ɾ��
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		cart.cartDelete(Integer.parseInt(strId));
		//    3��ɾ���ɹ��ˣ�ֱ����ת��http://localhost:8080/dangdang/cart��ַ���ض���
		response.sendRedirect("cart");
		
	
	}
}
