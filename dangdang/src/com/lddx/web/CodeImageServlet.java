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

import com.lddx.util.CodeUtil;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
//该Servlet负责生成验证码
public class CodeImageServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置验证码图片的格式
		response.setContentType("image/jpg");
		
		//BufferedImage表示图片的数据类型
		BufferedImage image=new BufferedImage(60,20,BufferedImage.TYPE_INT_RGB);
		//通过image来获得画笔
		Graphics g=image.getGraphics();
	
		//通过画笔g对image图片填充颜色
		//使用随机数给red，green和blue赋值，赋值的范围是0-255
		Random r=new Random();
		int red=r.nextInt(256);
		int green=r.nextInt(256);
		int blue=r.nextInt(256);
		//设置画笔的颜色
		g.setColor(new Color(red,green,blue));
		//使用画笔g去填充底色
		g.fillRect(0, 0, 60, 20);
		
		//使用画笔g往image中写入数字（验证码）
		//int number=r.nextInt(999999);//0-999998
		//String strCode=CodeUtil.createCode();
		String strCode=CodeUtil.createCode1();
		//设置画笔的颜色为黑色
		g.setColor(Color.black);
		//g.drawString(number+"",10,15);
		g.drawString(strCode,15,15);
		
		//使用画笔画几条干扰线
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		g.drawLine(r.nextInt(61),r.nextInt(21), r.nextInt(61),r.nextInt(21));
		
		//获得输出流
		OutputStream os=response.getOutputStream();
		//通过JPEGImageEncoder对image图片进行编码以及格式的压缩
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(os);
		encoder.encode(image);
		
	}

}
