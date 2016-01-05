package com.lee.spring012.scan.mvc.annotation;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")		// action为多例
public class PersonAction {

	@Resource
	public IStuService stuServiceImpl;

	public void displaySave() {
		System.out.println("mvc action: saving stu...");
		stuServiceImpl.saveStu();
	}

}
