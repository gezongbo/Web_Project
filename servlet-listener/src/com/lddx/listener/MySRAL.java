package com.lddx.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

//监听器，监听request域对象增加、修改和删除数据的操作
public class MySRAL implements ServletRequestAttributeListener{

	//监听往request域对象中新增数据的方法
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("新增了..."+arg0.getName()+","+arg0.getValue());
	}

	//监听从request域对象中移除数据的方法
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("移除了..."+arg0.getName()+","+arg0.getValue());
	}

	//监听request域对象中修改数据的方法
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("修改了..."+arg0.getName()+","+arg0.getValue());
	}

}
