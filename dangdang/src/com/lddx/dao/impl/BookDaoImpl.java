package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.lddx.bean.Book;
import com.lddx.dao.BookDao;
import com.lddx.util.DBUtil;

//服务器端 -- 模型层  M
//对BookDao的方法的重写，是BookDao的实现子类
public class BookDaoImpl implements BookDao{

	//获取数据库d_book表中所有的图书
	public ArrayList<Book> getAllBooks() {
		//定义一个空的ArrayList集合
		ArrayList<Book> books=new ArrayList<Book>();
		try {
			//获取数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from d_book";
			PreparedStatement prep=con.prepareStatement(sql);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			//循环从结果集中依次取出23本图书，封装到Book类中，最后放到集合中
			while(rs.next()){
				Book b=new Book();
				b.setId(rs.getInt("id"));
				b.setProductName(rs.getString("product_name"));
				b.setDescription(rs.getString("description"));
				b.setFixedPrice(rs.getDouble("fixed_price"));
				b.setDangPrice(rs.getDouble("dang_price"));
				//double saveMon=rs.getDouble("fixed_price")-rs.getDouble("dang_price");
				double saveMon=b.getFixedPrice()-b.getDangPrice();
				DecimalFormat df=new DecimalFormat("#.##");
				String strSave=df.format(saveMon);
				//System.out.println("strSave="+strSave);
				b.setSaveMoney(Double.parseDouble(strSave));
				b.setProductPic(rs.getString("product_pic"));
				b.setAuthor(rs.getString("author"));
				b.setPublishing(rs.getString("publishing"));
				long time=rs.getLong("publish_time");
				Date date=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String strDate=sdf.format(date);
				b.setPublishTime(strDate);
				//每一次循环，将封装好的b添加集合中
				books.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	//分页查询d_book表中的图书   
	//参数start是分页查询的下标，num是分页查询的数据个数
	public ArrayList<Book> getAllBooks(int start, int num) {
		//定义一个空的ArrayList集合
		ArrayList<Book> books=new ArrayList<Book>();
		try {
			//获取数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from d_book limit ?,?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, start);
			prep.setInt(2, num);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			//循环从结果集中依次取出23本图书，封装到Book类中，最后放到集合中
			while(rs.next()){
				Book b=new Book();
				//b.setId(rs.getInt("id"));
				b.setId(rs.getInt(1));
				//b.setProductName(rs.getString("product_name"));
				b.setProductName(rs.getString(2));
				b.setDescription(rs.getString("description"));
				b.setFixedPrice(rs.getDouble("fixed_price"));
				b.setDangPrice(rs.getDouble("dang_price"));
				//double saveMon=rs.getDouble("fixed_price")-rs.getDouble("dang_price");
				double saveMon=b.getFixedPrice()-b.getDangPrice();
				DecimalFormat df=new DecimalFormat("#.##");
				String strSave=df.format(saveMon);
				//System.out.println("strSave="+strSave);
				b.setSaveMoney(Double.parseDouble(strSave));
				b.setProductPic(rs.getString("product_pic"));
				b.setAuthor(rs.getString("author"));
				b.setPublishing(rs.getString("publishing"));
				long time=rs.getLong("publish_time");
				Date date=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String strDate=sdf.format(date);
				b.setPublishTime(strDate);
				//每一次循环，将封装好的b添加集合中
				books.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	//获取d_book表中所有数据的条数
	public int getCountByBook() {
		int count=0;  //数据的条数，初始值为0
		try {
			//获得数据库的连接
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select count(*) from d_book";
			PreparedStatement prep=con.prepareStatement(sql);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				//从结果集中取出第1列的数据
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	//根据id查询对应的图书的信息  select * from d_book where id=?
	public Book getBookById(int id) {
		Book b=new Book();
		try {
			//获得数据库的连接s
			Connection con=DBUtil.getCon();
			//预编译sql语句
			String sql="select * from d_book where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//执行sql语句
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				//如果结果集中有数据，将结果集中的数据取出来封装到book中
				b.setId(rs.getInt(1));
				//b.setProductName(rs.getString("product_name"));
				b.setProductName(rs.getString(2));
				b.setDescription(rs.getString("description"));
				b.setFixedPrice(rs.getDouble("fixed_price"));
				b.setDangPrice(rs.getDouble("dang_price"));
				//double saveMon=rs.getDouble("fixed_price")-rs.getDouble("dang_price");
				double saveMon=b.getFixedPrice()-b.getDangPrice();
				DecimalFormat df=new DecimalFormat("#.##");
				String strSave=df.format(saveMon);
				//System.out.println("strSave="+strSave);
				b.setSaveMoney(Double.parseDouble(strSave));
				b.setProductPic(rs.getString("product_pic"));
				b.setAuthor(rs.getString("author"));
				b.setPublishing(rs.getString("publishing"));
				long time=rs.getLong("publish_time");
				Date date=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String strDate=sdf.format(date);
				b.setPublishTime(strDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

}














