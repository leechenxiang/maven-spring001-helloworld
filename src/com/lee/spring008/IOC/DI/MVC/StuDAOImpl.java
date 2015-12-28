package com.lee.spring008.IOC.DI.MVC;

public class StuDAOImpl implements IStuDAO {

	@Override
	public void saveStu() {
		System.out.println("dao: saving stu...");
	}

}
