package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.dao.impl.UserDaoImpl;
//��֤�����Ƿ��Ѿ���ע�����Servlet
public class CheckEmailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ajax���ݹ����Ĳ���
		//...080/dangdang/checkemail?emaildata=abc@qq.com
		String strEmail=request.getParameter("emaildata");
		//System.out.println(strEmail);
		
		PrintWriter pw=response.getWriter();
		//ģ�⣬���������abc@qq.com�����������Ѿ���ע�����
		//������䲻��abc@qq.com�������������ʹ��
		/*
		if(strEmail.equals("abc@qq.com")){  //�Ѿ���ע�����
			pw.write("1");  //����1��ʾ�Ѿ���ע�����
		}else{  //����û�б�ע���������ʹ��
			pw.write("0");  //����0��ʾû��ע���������ʹ��
		}
		*/
		//����ģ�Ͳ㣬��ģ�Ͳ����ж������Ƿ��Ѿ���ע���
		UserDao dao=new UserDaoImpl();
		User user=dao.checkEmailIsUse(strEmail);
		if(user==null){  //�������ʹ��
			pw.write("0");
		}else{  //�����Ѿ���ע�����
			pw.write("1");
		}

	}

}
