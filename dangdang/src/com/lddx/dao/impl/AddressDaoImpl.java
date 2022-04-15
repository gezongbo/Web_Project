package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lddx.bean.Address;
import com.lddx.dao.AddressDao;
import com.lddx.util.DBUtil;

//是接口AddressDao的实现子类，实现关于d_address表的具体操作
public class AddressDaoImpl implements AddressDao{

	//将送货地址的内容插入到d_address表中  insert into d_address values(????)....
	public void addAddressInfo(Address address) {
		try {
			Connection con=DBUtil.getCon();
			String sql="insert into d_address(receive_name,full_address,postal_code,phone,mobile) values(?,?,?,?,?)";
			PreparedStatement prep= con.prepareStatement(sql);
			prep.setString(1,address.getReceiveName());
			prep.setString(2, address.getFullAddress());
			prep.setInt(3,address.getPostalCode());
			prep.setString(4, address.getPhone());
			prep.setLong(5, address.getMobile());
			prep.executeUpdate();
			DBUtil.close(null, prep, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
