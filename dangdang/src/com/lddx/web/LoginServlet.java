package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.dao.impl.UserDaoImpl;
//��ɵ�¼��Servlet
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1�����յ�¼ҳ������¼������ͬʱ���յ�¼ҳ�洫�ݵ�������������
		String strEmail=request.getParameter("email");
		String strPwd=request.getParameter("password");
		//System.out.println(strEmail+","+strPwd);
		//2������ģ�Ͳ㣬��ģ�Ͳ�ȥ�����������������ݿ����Ƿ���ȷ�����ؼ��Ľ��
		UserDao dao=new UserDaoImpl();
		User user=dao.isLogin(strEmail, strPwd);
		//System.out.println(user);
		//3������ģ�Ͳ㷵�صĽ������ת����¼ҳ�����booklist��ҳ
		if(user==null){ //˵������������벻��ȷ
			request.setAttribute("msg","����������벻��ȷ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{  //�����������ȷ�����
			//ת�����������ַ�����ᷢ���仯   localhost:8080/dangdang/booklist
			//request.getRequestDispatcher("booklist").forward(request, response);
			//��user�������������д洢
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			//�ض���:�������ַ����ַ�ᷢ���仯���仯�����ض����Ժ�ĵ�ַ
			response.sendRedirect("booklist");
		}
		
		
		
	}
}
