package com.lddx.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//�����֤���Ƿ���ȷ��Servlet
public class CheckCodeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ajax���͹����Ĳ���
		String validateCode=request.getParameter("code");
		//System.out.println(validateCode);  //��ע��ҳ�棬�������֤������
		
		//��ȡ���ڷ����������ɵ��Ǹ���֤��
		//�����ɵ���֤��(strCode)���������֤��(validateCode)�Ƚ�
		//ѡ��ʹ��session����ServletContext��ʵ������Servlet֮�����Դ�Ĺ���
		HttpSession session=request.getSession();
		String strCode=(String)session.getAttribute("strCode");
		
		PrintWriter pw=response.getWriter();//��ҳ��������
		//�Ƚ�
		if(strCode.equals(validateCode)){   //��ȵ�������������֤������ȷ��
			pw.write("1");  //1��ʾ��ȷ
		}else{  //����ȵ�������������֤���Ǵ����
			pw.write("0"); //0��ʾ����
		}
		
	}

}
