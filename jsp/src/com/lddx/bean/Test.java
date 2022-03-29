package com.lddx.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		Student stu=new Student();
		
		//stu.setAge(10);
		//stu.setId(1001);
		//stu.setName("张三");
		/*
		stu.study();
		String strName=stu.getName();
		System.out.println(strName);
		System.out.println("stu="+stu);
		
		Student stu1=new Student(1002,"李四",40);
		System.out.println(stu1.getName());
		stu1.study();
		System.out.println("stu1="+stu1);
		
		Student stu2=new Student(1003,"王五");
		System.out.println("stu2="+stu2);
		stu2.getAge();
		stu2.getId();
		stu2.getName();
		*/
		/*
		 *   接口                     类
		 *   List   -> ArrayList   1个数据
		 *   Set   -->  HashSet    1个数据
		 *   Map   -->  HashMap    一对数据
		 */
		String[] arr=new String[3];
		arr[0]="a";
		arr[1]="b";
		arr[2]="a";
		System.out.println(Arrays.toString(arr));//[a, b, a]
	    List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println(list);//[a, b, a]
		String ss=list.get(1);
		System.out.println(ss);
		Set<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("a");
		System.out.println(set); //[b, a]
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "a");
		System.out.println(map);//{1=a, 2=b, 3=a}
		
		
		
		
		
	}
}
