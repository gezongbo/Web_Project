package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//����˳��Ĺ���
public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���յ��ҳ���˳����͹���������,��ȡsession,��sessionʧЧ
		HttpSession session=request.getSession();
		session.setAttribute("user", null);
		//session.invalidate();
		//�ض���booklist��ҳ
		response.sendRedirect("booklist");
	}

}
