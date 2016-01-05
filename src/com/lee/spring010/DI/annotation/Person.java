package com.lee.spring010.DI.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	@Resource
//	@Resource(name="studentA")
//	@Autowired 纯粹按照类型进行匹配
//	@Qualifier("studentA")
	private Student studentA;

//	public Student getStudentA() {
//		return studentA;
//	}
	
	public void tell() {
		studentA.sayHello();
	}

	
}
