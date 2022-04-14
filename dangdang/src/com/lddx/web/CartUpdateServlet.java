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
//���ﳵ�������޸ĵĹ���
public class CartUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//˼·��1�����չ��ﳵ�е�����ʱ���͹���������,ͬʱҲҪ���������͹����Ĳ���
		String strNum=request.getParameter("num");  //���������
		String strId=request.getParameter("id");   //���id
		//System.out.println(strNum);
		//System.out.println(strId);
		//2�����session,ͨ��session��ù��ﳵ
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		cart.cartUpdate(Integer.parseInt(strNum), Integer.parseInt(strId));
		//3���޸�����Ժ���ת��http://localhost:8080/dangdang/cart��ַ
		response.sendRedirect("cart");
		
		
	}

}
