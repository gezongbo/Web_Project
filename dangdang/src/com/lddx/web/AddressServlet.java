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
//�������˵�Servlet��
//����ͻ���ַҳ������һ���Ĺ���
public class AddressServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//˼·��1�������ͻ���ַҳ������һ��������ͬʱ��ȡҳ������ݹ��������ݣ��ջ��ˡ���ַ��������롢�绰���ֻ���
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
		//2������ģ�Ͳ㣬��ģ�Ͳ���ɵ�ַ��Ϣ�����ݲ��뱣��insert into  d_address??????
		AddressDao dao=new AddressDaoImpl();
		Address address=new Address();
		address.setReceiveName(receiveName);
		address.setFullAddress(fullAddress);
		address.setPostalCode(Integer.parseInt(postalCode));
		address.setPhone(phone);
		address.setMobile(Long.parseLong(mobile));
		dao.addAddressInfo(address);
		
		//3������ģ�Ͳ㣬��ģ�Ͳ����d_item������ݲ���
		ItemDao itemDao=new ItemDaoImpl();
		//�Ȼ�ȡsession,��session��ȡ���ﳵcart,�ٴӹ��ﳵcart�л�ȡitemList����
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		ArrayList<BookItem> itemList=null;
		if(cart!=null){
			itemList=cart.getItemList();
		}
		//orderId�Ƕ����ţ�ʹ��Random������������һ����
		Random r=new Random();
		int orderId=r.nextInt(10000000);
		itemDao.addItemInfo(itemList, orderId);
	
		//4������ģ�Ͳ㣬��ģ�Ͳ����d_order������ݲ���
		OrderDao orderDao=new OrderDaoImpl();
		Order order=new Order();
		order.setOrderId(orderId);  //���ö�����
		Date date=new Date();//������ǰϵͳʱ��
		order.setOrderTime(date.getTime()); //���ö���ʱ��
		order.setTotalPrice(cart.getTotalPrice());//�����ܽ��
		User user=(User)session.getAttribute("user");
		order.setUserId(user.getId());  //�����û�id
		orderDao.addOrderInfo(order);
		
		//5����ת��order_ok.jspҳ�棬�����ɵĶ�����һ���͵�ҳ����ʾ
		//ת��
		request.setAttribute("orderId",orderId);
		request.getRequestDispatcher("order_ok.jsp").forward(request, response);
		
	}

}
