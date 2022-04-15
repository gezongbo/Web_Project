package com.lddx.bean;
//javabean类  -- d_order表
public class Order {
	private int id;  //主键
	private int userId;//用户id
	private long orderTime; //订单时间
	private int orderId;  //订单号
	private double totalPrice; //总消费金额
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public long getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(long orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	public Order(int id, int userId, long orderTime, int orderId,
			double totalPrice) {
		super();
		this.id = id;
		this.userId = userId;
		this.orderTime = orderTime;
		this.orderId = orderId;
		this.totalPrice = totalPrice;
	}
	public Order() {
		super();
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", orderTime="
				+ orderTime + ", totalPrice=" + totalPrice + ", userId="
				+ userId + "]";
	}
	
	
	
	
	
	
}
