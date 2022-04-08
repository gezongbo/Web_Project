package com.lddx.web;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lddx.util.CodeUtil;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
//��Servlet����������֤��
public class CodeImageServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������֤��ͼƬ�ĸ�ʽ
		response.setContentType("image/jpg");
		
		//BufferedImage��ʾͼƬ����������
		BufferedImage image=new BufferedImage(60,20,BufferedImage.TYPE_INT_RGB);
		//ͨ��image����û���
		Graphics g=image.getGraphics();
	
		//ͨ������g��imageͼƬ�����ɫ
		//ʹ���������red��green��blue��ֵ����ֵ�ķ�Χ��0-255
		Random r=new Random();
		int red=r.nextInt(256);
		int green=r.nextInt(256);
		int blue=r.nextInt(256);
		//���û��ʵ���ɫ
		g.setColor(new Color(red,green,blue));
		//ʹ�û���gȥ����ɫ
		g.fillRect(0, 0, 60, 20);
		
		//ʹ�û���g��image��д�����֣���֤�룩
		//int number=r.nextInt(999999);//0-999998
		//String strCode=CodeUtil.createCode();
		String strCode=CodeUtil.createCode1();
		//��ȡsession�������ɵ���֤��洢��session��
		HttpSession session=request.getSession();
		session.setAttribute("strCode",strCode);
		//���û��ʵ���ɫΪ��ɫ
		g.setColor(Color.black);
		//g.drawString(number+"",10,15);
		g.drawString(strCode,15,15);
		
		//ʹ�û��ʻ�����������
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		
		//��������
		OutputStream os=response.getOutputStream();
		//ͨ��JPEGImageEncoder��imageͼƬ���б����Լ���ʽ��ѹ��
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(os);
		encoder.encode(image);
		
	}

}
