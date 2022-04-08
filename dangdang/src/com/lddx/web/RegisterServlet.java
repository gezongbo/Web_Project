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
//���ע��ҳ���ע�Ṧ��
public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//http://localhost:8080/dangdang/register
		//?email=abddc%40qq.cdom&nickname=aaaaaa&password=abc123&password1=abc123&validateCode=Db49
		//1������ע��ҳ����ע�������ͬʱ���ձ��ύ�Ĳ���
		request.setCharacterEncoding("utf-8");
		String strEmail=request.getParameter("email");
		String strNickname=request.getParameter("nickname");
		String strPwd=request.getParameter("password");
		//System.out.println(strEmail+","+strNickname+","+strPwd);
		
		//2������ģ�Ͳ㣬��ģ�Ͳ㽫�ύ�����ݲ��뵽���ݿ���
		UserDao dao=new UserDaoImpl();
		User user=new User();
		user.setEmail(strEmail);
		user.setNickname(strNickname);
		user.setPassword(strPwd);
		dao.saveUser(user);
		
		//3����ģ�Ͳ���ɲ����Ժ���ת����¼ҳ��(login.jsp)
		//ת��   �ض���
		response.sendRedirect("login.jsp");
		
	}

}
