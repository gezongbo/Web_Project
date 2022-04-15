package com.lddx.dao;

import com.lddx.bean.Address;

//封装关于d_address表的操作
public interface AddressDao {
	//将送货地址的内容插入到d_address表中  insert into d_address values(????)....
	public void addAddressInfo(Address address);
	
}
