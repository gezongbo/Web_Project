package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�̳�  ����  ����
//����ע��ҳ��������servlet
public class RegisterServlet1 extends HttpServlet{

	
	//����doGet����   -- ֻ����get����ʽ
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//System.out.println("����doGet...");
		//ʹ��req�����������
		String strName=req.getParameter("username");
		System.out.println("strName="+strName);//?????
		//����������������
		byte[] bs=strName.getBytes("iso8859-1");
		System.out.println(Arrays.toString(bs));//  [-27, -68, -96, -28, -72, -119]
		String name=new String(bs,"utf-8");
		System.out.println(name);//����
		
		
	
		
	}
	
	//����doPost����  --ֻ����post����ʽ
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//������������еı���
		req.setCharacterEncoding("utf-8");
		//System.out.println("����doPost...");
		//ʹ��req�����������
		String strName=req.getParameter("username");
		System.out.println(strName);//����	
	}
	
	//����service���� -- get�����post���󶼽���
	/*
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("����service...");
	}
	*/
	
}
