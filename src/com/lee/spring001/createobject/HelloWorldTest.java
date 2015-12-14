package com.lee.spring001.createobject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	/**
	 * 在spring容器中，默认情况下调用一个类的默认构造方法来创建对象
	 */
	@Test
	public void testHelloWorld() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		hello.hello();
	}
}
