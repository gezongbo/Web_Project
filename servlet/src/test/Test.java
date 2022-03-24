package test;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		//StringBufferµÄÊ¹ÓÃ
		String str="abc";
		System.out.println(str);
		
		StringBuffer sbuf=new StringBuffer();
		sbuf.append("a");
		sbuf.append("b");
		sbuf.append("c");
		sbuf.append("d");
		System.out.println(sbuf);
		System.out.println(sbuf.toString());
		StringBuffer sbuf1=new StringBuffer("abcdef");
		System.out.println(sbuf1);
		sbuf1.append("sss");
		System.out.println(sbuf1);
		
		System.out.println(100+100);
		
		Date date=new Date();
		System.out.println(date);
		
	}

}
