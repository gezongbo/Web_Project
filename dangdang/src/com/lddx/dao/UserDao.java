package com.lddx.dao;

import com.lddx.bean.User;

//UserDao��װ�˶�d_user������ز���
public interface UserDao {
	//��������Ƿ��Ѿ���ע���
	//select * from d_user where email='123@qq.com';
	//User���ص���null����ʾ�������ʹ��
	//User���صĲ���null�������ݣ���ʾ�����Ѿ���ע�����
	public User checkEmailIsUse(String email);
	
	//ע��ʱ�������䣬�ǳƺ����뱣�浽d_user����
	//insert into d_user values(???....);
	public void saveUser(User user);
	
	//�Ƿ���Ե�¼���ܣ�select * from d_user where email='abc@qq.com' and password='abc123';
	//public boolean isLogin(String email,String password);
	//User���ص������null��˵������������벻��ȷ��
	//User���صĲ���null��˵���������������ȷ��
	public User isLogin(String email,String password);
	
	
}
