package com.lee.spring008.IOC.DI.MVC;

public class PersonAction {

	public IStuService stuService;

	public void displaySave() {
		stuService.saveStu();
	}

	public IStuService getStuService() {
		return stuService;
	}

	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}

}
