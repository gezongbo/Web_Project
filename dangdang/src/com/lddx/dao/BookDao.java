package com.lddx.dao;

import java.util.ArrayList;

import com.lddx.bean.Book;

//��������  -- ģ�Ͳ� M  
//BookDao�ӿڣ���װ�˹���d_book���������ݿ����
public interface BookDao {
	//��ȡ���ݿ�d_book�������е�ͼ��
	public ArrayList<Book> getAllBooks();
	//��ҳ��ѯd_book���е�ͼ��   
	//����start�Ƿ�ҳ��ѯ���±꣬num�Ƿ�ҳ��ѯ�����ݸ���
	public ArrayList<Book> getAllBooks(int start,int num);

	
	
}
