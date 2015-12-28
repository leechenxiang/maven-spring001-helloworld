package com.lee.spring008.IOC.DI.MVC;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void testPersonAction() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction person = (PersonAction)context.getBean("personAction");
		person.displaySave();
	}

}
