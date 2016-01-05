package com.lee.spring012.scan.mvc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void testPersonAction() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-scan-mvc.xml");
		PersonAction person = (PersonAction)context.getBean("personAction");
		person.displaySave();
	}

}
