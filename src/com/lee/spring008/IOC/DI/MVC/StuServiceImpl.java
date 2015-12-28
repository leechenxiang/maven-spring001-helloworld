package com.lee.spring008.IOC.DI.MVC;

public class StuServiceImpl implements IStuService {

	public IStuDAO stuDAO;
	
	@Override
	public void saveStu() {
		System.out.println("service: saving stu...");
		stuDAO.saveStu();
	}

	public IStuDAO getStuDAO() {
		return stuDAO;
	}

	public void setStuDAO(IStuDAO stuDAO) {
		this.stuDAO = stuDAO;
	}

}
