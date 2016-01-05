package com.lee.spring009.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonStudentTest {

	@Test
	public void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = (Student)context.getBean("studentExtend");
		System.out.println(stu.getName());
	}

}
