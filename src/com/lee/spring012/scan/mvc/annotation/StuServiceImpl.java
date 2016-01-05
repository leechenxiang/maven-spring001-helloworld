package com.lee.spring012.scan.mvc.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements IStuService {

	@Resource
	public IStuDAO stuDAOImpl;
	
	@Override
	public void saveStu() {
		System.out.println("mvc service: saving stu...");
		stuDAOImpl.saveStu();
	}

}
