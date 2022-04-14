package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lddx.bean.User;
import com.lddx.dao.UserDao;
import com.lddx.util.DBUtil;

//��UserDao�ӿڵ�ʵ������
public class UserDaoImpl implements UserDao{

	//��������Ƿ��Ѿ���ע���
	//User���ص���null����ʾ�������ʹ��
	//User���صĲ���null�������ݣ���ʾ�����Ѿ���ע�����
	public User checkEmailIsUse(String email) {
		User user=null;
		try {
			//��ȡ���ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from d_user where email=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,email);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			if(rs.next()){ //����������˵��rs������������ݣ����������ݿ��д��ڣ������Ѿ�������ע�����
				user=new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setNickname(rs.getString("nickname"));
				user.setPassword(rs.getString("password"));
			}
			//�ر�
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	//ע��ʱ�������䣬�ǳƺ����뱣�浽d_user����
	public void saveUser(User user) {
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="insert into d_user(email,nickname,password) values(?,?,?)";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, user.getEmail());
			prep.setString(2, user.getNickname());
			prep.setString(3, user.getPassword());
			//ִ��sql���
			prep.executeUpdate();
			//�ر�
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//�Ƿ���Ե�¼���ܣ�select * from d_user where email='abc@qq.com' and password='abc123';
	//public boolean isLogin(String email,String password);
	//User���ص������null��˵������������벻��ȷ��
	//User���صĲ���null��˵���������������ȷ��
	public User isLogin(String email, String password) {
		User user=null;
		try {
			//������ݿ������
			Connection con=DBUtil.getCon();
			//Ԥ����sql���
			String sql="select * from d_user where email=? and password=?";
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1, email);
			prep.setString(2, password);
			//ִ��sql���
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				user=new User();
				user.setNickname(rs.getString("nickname"));
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
			//�ر�����
			DBUtil.close(rs, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	
	
	
	
	
}







