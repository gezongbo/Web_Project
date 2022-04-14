package com.lddx.bean;

import java.text.DecimalFormat;
import java.util.ArrayList;

//���ﳵ��  --�������˼�������--���ﳵ --���������顢���ϣ�
//javabean�淶
public class Cart {
  
	//˽������
	//���ﳵʵ���Ͼ���һ��������ʹ��ArrayList��������ʾ���ﳵ����������
	private ArrayList<BookItem> itemList=new ArrayList<BookItem>();

	
	//��ɹ��ﳵ��ɾ��һ��ͼ����Ŀ�ķ������Ӽ���itemList�е���remove������Ӧ���Ƴ���Ҫɾ�������ݣ�
	//id��ʾͼ���id
	public void cartDelete(int id){
		//˼·�����ݴ��ݹ�����id��ֵ��ȷʵ��Ҫɾ�����ı���
		//    ����ķ��ڹ���������е�ͼ�飬���Ƿ��ڼ���itemList��
		for(int i=0;i<itemList.size();i++){
			//item��ʾһ��ͼ����Ŀ���൱���ڹ��ﳵ�е�һ�������ݣ�
			BookItem item=itemList.get(i);
			if(item.getBook().getId()==id){  //Ҫɾ�������id�͹��ﳵ�е��Ѿ���������id���
				//i��ʾ����Ҫɾ�����Ǳ����ڼ����е��±�
				itemList.remove(i);
			}
		}
	}
	
	//��ɹ��ﳵ�и�����������ķ���
	//num��ʾ�޸ĵ��������   id��ʾͼ���id
	public void cartUpdate(int num,int id){
		for(int i=0;i<itemList.size();i++){
			BookItem item=itemList.get(i);
			if(item.getBook().getId()==id){ //�����������ҵ���Ҫ�޸ĵ�ͼ��
				item.setCount(num);
			}
		}
	}
	
	
	
	//���㹺�ﳵ������ͼ����ܽ�ʡ���
	//һ����Ľ�ʡ���*�Ȿ���������Ȼ��͹��ﳵ��ÿһ�����ۼ����
	public double getTotalSave(){
		//for(int i=0;i<itemList.size();i++){
			//BookItem item=itemList.get(i);
		//}
		double totalSave=0; //���ﳵ������ͼ����ܽ�ʡ���
		for(BookItem item:itemList){
			//item.getBook().getSaveMoney()   //һ����Ľ�ʡ���
			//item.getCount()    //�Ȿ��Ĺ�������
			//oneItemSave��ʾһ��ͼ����Ŀ��ʡ�Ľ��
			double oneItemSave=item.getBook().getSaveMoney()*item.getCount();
			totalSave=totalSave+oneItemSave;
		}
		DecimalFormat df=new DecimalFormat("#.##");
		String strTotalSave=df.format(totalSave);
		return Double.parseDouble(strTotalSave);
	}
	
	
	//���㹺�ﳵ������ͼ��������ѽ��
	public double getTotalPrice(){
		double totalPrice=0;//�ܽ��
		for(BookItem item:itemList){
			//item.getBook().getDangPrice()   //һ����ĵ�����
			//item.getCount()   //�Ȿ��Ĺ�������
			//oneItemPrice��ʾһ��ͼ����Ŀ�������ѽ��
			double oneItemPrice=item.getBook().getDangPrice()*item.getCount(); 
			totalPrice=totalPrice+oneItemPrice;
		}
		DecimalFormat df=new DecimalFormat("#.##");
		String strTotalPrice=df.format(totalPrice);
		return Double.parseDouble(strTotalPrice);
	}
	
	
	
	//get��set����
	public ArrayList<BookItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<BookItem> itemList) {
		this.itemList = itemList;
	}

	
	//���췽��
	public Cart(ArrayList<BookItem> itemList) {
		super();
		this.itemList = itemList;
	}

	public Cart() {
		super();
	}

	//toString����
	public String toString() {
		return "Cart [itemList=" + itemList + "]";
	}
	
	
	
}
