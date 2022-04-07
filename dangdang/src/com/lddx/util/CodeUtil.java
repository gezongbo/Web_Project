package com.lddx.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

//������֤��Ĺ�����
public class CodeUtil {

	static String[] codes={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g",
		//�±�                                       0   1   2   3   4   5   6   7   8    9  10  11  12  13  14  15  16
			              "A","B","C","D","E","F","G","H"};
	   //�±�                                     17   18  19  20  21  22  23  24
	
	//ͨ���÷�������һ��4λ�����֤�룬4λ��֤������ĸ���������
	//����˼·����codes�����У�ʹ������������±꣬���ȡ4�����ݣ����һ���µ����鷵��
	//4λ�����ظ�����֤��
	public static String createCode(){
		//����һ�������飬��СΪ4
		String[] cs=new String[4];
		Random r=new Random();
		for(int i=0;i<cs.length;i++){  //i=0 1 2 3
			//��ѭ��ִ��4�飬��codes���������ȡһ����Ȼ�����cs������
			int index=r.nextInt(codes.length);  //index��ȡֵ0-24
			cs[i]=codes[index];
		}
		//cs=[5,1]   1
		//��cs�����е�����ȡ������ϳ��ַ����������ַ���
		//cs=[c, A, c, B]
		//             s
		String strCode=""; //""  "c"  "cA"  "cAc"  "cAcB"
		for(String s:cs){
			strCode=strCode+s;
		}
		return strCode;
	}
	
	//4λ���ظ�����֤��
	public static String createCode1(){
		//ArrayList  HashSet   HashMap
		HashSet<String> set=new HashSet<String>();//[]
		Random r=new Random();
		//ͨ����ѭ������codes���������ȡ���ݣ�Ȼ�����ֱ��set�У�ֱ��set���ϵĴ�СΪ4�ˣ���ѭ������
		while(true){
			int index=r.nextInt(codes.length); //0-24
			set.add(codes[index]);  
			//�жϼ��ϵĴ�С�Ƿ�Ϊ4��Ϊ4����ѭ��
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







