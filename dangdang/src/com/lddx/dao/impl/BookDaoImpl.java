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

//�������� -- ģ�Ͳ�  M
//��BookDao�ķ�������д����BookDao��ʵ������
public class BookDaoImpl implements BookDao{

	//��ȡ���ݿ�d_book�������е�ͼ��
	public ArrayList<Book> getAllBooks() {
		//����һ���յ�ArrayList����
		ArrayList<Book> books=new ArrayList<Book>();
		try {
			//��ȡ���ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from d_book";
			PreparedStatement prep=con.prepareStatement(sql);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			//ѭ���ӽ����������ȡ��23��ͼ�飬��װ��Book���У����ŵ�������
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
				//ÿһ��ѭ��������װ�õ�b��Ӽ�����
				books.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	//��ҳ��ѯd_book���е�ͼ��   
	//����start�Ƿ�ҳ��ѯ���±꣬num�Ƿ�ҳ��ѯ�����ݸ���
	public ArrayList<Book> getAllBooks(int start, int num) {
		//����һ���յ�ArrayList����
		ArrayList<Book> books=new ArrayList<Book>();
		try {
			//��ȡ���ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from d_book limit ?,?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, start);
			prep.setInt(2, num);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			//ѭ���ӽ����������ȡ��23��ͼ�飬��װ��Book���У����ŵ�������
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
				//ÿһ��ѭ��������װ�õ�b��Ӽ�����
				books.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	//��ȡd_book�����������ݵ�����
	public int getCountByBook() {
		int count=0;  //���ݵ���������ʼֵΪ0
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select count(*) from d_book";
			PreparedStatement prep=con.prepareStatement(sql);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				//�ӽ������ȡ����1�е�����
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	//����id��ѯ��Ӧ��ͼ�����Ϣ  select * from d_book where id=?
	public Book getBookById(int id) {
		Book b=new Book();
		try {
			//������ݿ������s
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from d_book where id=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				//���������������ݣ���������е�����ȡ������װ��book��
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














