package com.lee.spring011.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("personA")
public class Person {
	
	@Resource
//	@Resource(name="studentA")
//	@Autowired 纯粹按照类型进行匹配
//	@Qualifier("studentA")
	private Student student;

//	public Student getStudentA() {
//		return studentA;
//	}
	
	public void tell() {
		student.sayHello();
	}

	
}
