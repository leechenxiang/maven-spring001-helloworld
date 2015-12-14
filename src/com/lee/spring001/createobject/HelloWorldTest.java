package com.lee.spring001.createobject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	/**
	 * ��spring�����У�Ĭ������µ���һ�����Ĭ�Ϲ��췽������������
	 */
	@Test
	public void testHelloWorld() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		hello.hello();
	}
}
