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
//处理购买功能的Servlet
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ajax发送请求中的参数
		String strId=request.getParameter("idData");
		//System.out.println(strId);
		
		//思路：1、调用模型层，让模型层根据id将对应的书的信息查询出来 -->Book
		//    2、创建Session,创建购物车Cart,将模型层查询出来的书Book和数量1放入购物车中，购物车要放入session中存储
		//    3、判断是第一次购买还是已经购买过了，将购买的信息返回浏览器端  ***
		
		BookDao dao=new BookDaoImpl();
		Book book=dao.getBookById(Integer.parseInt(strId));
		//System.out.println(book);
		
		int index=0;  //开关，控制是否可以购买图书的开关；如果index=0表示可以购买
		//如果index=-1表示不可以购买
		
		HttpSession session=request.getSession();
		//购物车,每一次完成购买，都是创建一个新的购物车
		//Cart cart=new Cart();
		//从session直接取购物车cart，如果能session中能取出来，不为空，说明不是第一次购买；如果从session中取购物车cart，
		//取出来的是空，说明是第一次购买，需要创建购物车。
		Cart cart=(Cart)session.getAttribute("cart");
		//System.out.println("前:"+cart);
		if(cart==null){  //如果cart是null,说明是第一次点击购买
			//创建一个新的购物车，放入session
			session.setAttribute("cart", new Cart());
			//在重新从session取出购物车
			cart=(Cart)session.getAttribute("cart");
		}else{ //在购物车不为空的情况下，判断购物车中是否有已经购买过的图书了
			ArrayList<BookItem> itemList=cart.getItemList();//获取购物车中的集合容器
			//使用循环遍历itemList集合，看一下该集合中是否有已经购买过的图书
			for(BookItem item:itemList){
				//遍历的集合中的书的id和参数传递过来的strId比较，如果相等，说明购物车中已经有你要买的这本书了
				if(item.getBook().getId()==Integer.parseInt(strId)){
					index=-1;
				}
			}
		}
		
		//完成购买的代码
		if(index==0){  //开关等于0，可以购买；开关等于-1，不可以购买
			//cart不为空的情况，需要将购买的书和数量放入购物车中，购物车在重新放入session中
			ArrayList<BookItem> itemList=cart.getItemList();
			//创建一个图书条目，数量是1，书是book
			BookItem item=new BookItem(book,1);
			//将图书条目放入购物车中的集合里
			itemList.add(item);
			//将购物车放入session中存储
			session.setAttribute("cart",cart);
		}
	
		//System.out.println("后:"+cart);
		//根据index取值来判断是否购买成功
		PrintWriter pw=response.getWriter();
		if(index==0){   //购买成功了
			pw.write("0");
		}else if(index==-1){  //未购买成功
			pw.write("-1");
		}
			
		
		
	}

}





