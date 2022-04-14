package com.lddx.test;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		//list.remove(1);
		list.remove("b");
		System.out.println(list);
	}

}
