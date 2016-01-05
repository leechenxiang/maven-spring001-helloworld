package com.lee.spring012.scan.mvc.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class StuDAOImpl implements IStuDAO {

	@Override
	public void saveStu() {
		System.out.println("mvc dao: saving stu...");
	}

}
