package com.lddx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lddx.bean.Address;
import com.lddx.dao.AddressDao;
import com.lddx.util.DBUtil;

//�ǽӿ�AddressDao��ʵ�����࣬ʵ�ֹ���d_address��ľ������
public class AddressDaoImpl implements AddressDao{

	//���ͻ���ַ�����ݲ��뵽d_address����  insert into d_address values(????)....
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
