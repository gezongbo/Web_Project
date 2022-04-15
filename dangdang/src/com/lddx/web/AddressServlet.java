package com.lddx.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.Address;
import com.lddx.bean.BookItem;
import com.lddx.bean.Cart;
import com.lddx.bean.Order;
import com.lddx.bean.User;
import com.lddx.dao.AddressDao;
import com.lddx.dao.ItemDao;
import com.lddx.dao.OrderDao;
import com.lddx.dao.impl.AddressDaoImpl;
import com.lddx.dao.impl.ItemDaoImpl;
import com.lddx.dao.impl.OrderDaoImpl;
import com.lddx.util.DBUtil;
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
		//System.out.println(receiveName);
		//System.out.println(fullAddress);
		//System.out.println(postalCode);
		//System.out.println(phone);
		//System.out.println(mobile);
		//2、调用模型层，让模型层完成地址信息的数据插入保存insert into  d_address??????
		AddressDao dao=new AddressDaoImpl();
		Address address=new Address();
		address.setReceiveName(receiveName);
		address.setFullAddress(fullAddress);
		address.setPostalCode(Integer.parseInt(postalCode));
		address.setPhone(phone);
		address.setMobile(Long.parseLong(mobile));
		dao.addAddressInfo(address);
		
		//3、调用模型层，让模型层完成d_item表的数据插入
		ItemDao itemDao=new ItemDaoImpl();
		//先获取session,从session获取购物车cart,再从购物车cart中获取itemList集合
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		ArrayList<BookItem> itemList=null;
		if(cart!=null){
			itemList=cart.getItemList();
		}
		//orderId是订单号，使用Random随机数随机生成一个数
		Random r=new Random();
		int orderId=r.nextInt(10000000);
		itemDao.addItemInfo(itemList, orderId);
	
		//4、调用模型层，让模型层完成d_order表的数据插入
		OrderDao orderDao=new OrderDaoImpl();
		Order order=new Order();
		order.setOrderId(orderId);  //设置订单号
		Date date=new Date();//创建当前系统时间
		order.setOrderTime(date.getTime()); //设置订单时间
		order.setTotalPrice(cart.getTotalPrice());//设置总金额
		User user=(User)session.getAttribute("user");
		order.setUserId(user.getId());  //设置用户id
		orderDao.addOrderInfo(order);
		
		//5、跳转到order_ok.jsp页面，将生成的订单号一起发送到页面显示
		//转发
		request.setAttribute("orderId",orderId);
		request.getRequestDispatcher("order_ok.jsp").forward(request, response);
		
	}

}
