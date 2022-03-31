package com.lddx.test;

import java.util.ArrayList;

import com.lddx.bean.Emp;
import com.lddx.dao.EmpDao;
import com.lddx.dao.impl.EmpDaoImpl;

//≤‚ ‘¿‡
public class Test {
	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		ArrayList<Emp> emps=dao.getAllEmps();
		System.out.println(emps);
	}
}
