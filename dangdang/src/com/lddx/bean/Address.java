package com.lddx.bean;
//javabean�� == d_address��
public class Address {
	private int id;//����
	private String receiveName; //�ռ���
	private String fullAddress; //��ַ
	private int postalCode;  //��������
	private String phone;  //�绰
	private long mobile;  //�ֻ�
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public Address(int id, String receiveName, String fullAddress,
			int postalCode, String phone, long mobile) {
		super();
		this.id = id;
		this.receiveName = receiveName;
		this.fullAddress = fullAddress;
		this.postalCode = postalCode;
		this.phone = phone;
		this.mobile = mobile;
	}
	public Address() {
	
	}
	
	@Override
	public String toString() {
		return "Address [fullAddress=" + fullAddress + ", id=" + id
				+ ", mobile=" + mobile + ", phone=" + phone + ", postalCode="
				+ postalCode + ", receiveName=" + receiveName + "]";
	}
	
	
	
}
