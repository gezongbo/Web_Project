package com.lddx.bean;
//����--�û�����
//javabean -- ���ݿ���d_user��
public class User {
	//˽������
	private int id;   //����
	private String email;   //����
	private String nickname; //�ǳ�
	private String password; //����
	
	//���get��set����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//���췽��
	public User(int id, String email, String nickname, String password) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.password = password;
	}
	
	public User() {
		super();
	}
	
	
	//��ӵ�toString����
	public String toString() {
		return "User [email=" + email + ", id=" + id + ", nickname=" + nickname
				+ ", password=" + password + "]";
	}
	
	
	
}
