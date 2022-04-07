package com.lddx.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

//生成验证码的工具类
public class CodeUtil {

	static String[] codes={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g",
		//下标                                       0   1   2   3   4   5   6   7   8    9  10  11  12  13  14  15  16
			              "A","B","C","D","E","F","G","H"};
	   //下标                                     17   18  19  20  21  22  23  24
	
	//通过该方法生成一个4位随机验证码，4位验证码由字母和数字组成
	//核心思路：从codes数组中，使用随机数根据下标，随机取4个内容，组成一个新的数组返回
	//4位可以重复的验证码
	public static String createCode(){
		//定义一个新数组，大小为4
		String[] cs=new String[4];
		Random r=new Random();
		for(int i=0;i<cs.length;i++){  //i=0 1 2 3
			//该循环执行4遍，从codes数组中随机取一个，然后放入cs数组中
			int index=r.nextInt(codes.length);  //index的取值0-24
			cs[i]=codes[index];
		}
		//cs=[5,1]   1
		//将cs数组中的内容取出，组合成字符串，返回字符串
		//cs=[c, A, c, B]
		//             s
		String strCode=""; //""  "c"  "cA"  "cAc"  "cAcB"
		for(String s:cs){
			strCode=strCode+s;
		}
		return strCode;
	}
	
	//4位不重复的验证码
	public static String createCode1(){
		//ArrayList  HashSet   HashMap
		HashSet<String> set=new HashSet<String>();//[]
		Random r=new Random();
		//通过死循环，从codes数组中随机取数据，然后放入直接set中，直到set集合的大小为4了，死循环结束
		while(true){
			int index=r.nextInt(codes.length); //0-24
			set.add(codes[index]);  
			//判断集合的大小是否为4，为4结束循环
			if(set.size()==4){
				break;
			}
		}
		String strCode="";
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			strCode=strCode+itr.next();
		}
		return strCode;
	}
	
	
	
}







