package com.lddx.bean;
//对象--用户对象
//javabean -- 数据库中d_user表
public class User {
	//私有属性
	private int id;   //主键
	private String email;   //邮箱
	private String nickname; //昵称
	private String password; //密码
	
	//添加get和set方法
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
	
	//构造方法
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
	
	
	//添加的toString方法
	public String toString() {
		return "User [email=" + email + ", id=" + id + ", nickname=" + nickname
				+ ", password=" + password + "]";
	}
	
	
	
}
