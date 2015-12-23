package com.lee.spring007.di.xml.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterTest {
	
	@Test
	public void testSetter() {
		// Æô¶¯spring ÈÝÆ÷
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person)context.getBean("person");
		person.getStu().say();
	}
	
}
