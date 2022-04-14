package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//服务器端的Servlet类
//完成送货地址页面点击下一步的功能
public class AddressServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//思路：1、接收送货地址页面点击下一步的请求，同时获取页面表单传递过来的数据（收货人、地址、邮箱编码、电话、手机）
		String receiveName=request.getParameter("receiveName");
		String fullAddress=request.getParameter("fullAddress");
		String postalCode=request.getParameter("postalCode");
		String phone=request.getParameter("phone");
		String mobile=request.getParameter("mobile");
		System.out.println(receiveName);
		System.out.println(fullAddress);
		System.out.println(postalCode);
		System.out.println(phone);
		System.out.println(mobile);
		//2、调用模型层，让模型层完成地址信息的数据插入保存insert into  d_address??????
		
		//3、调用模型层，让模型层完成d_item表的数据插入
		
		//4、调用模型层，让模型层完成d_order表的数据插入
		
		//5、跳转到order_ok.jsp页面，将生成的订单号一起发送到页面显示
		
	}

}
