package com.lee.spring003.alias;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.spring001.createobject.HelloWorld;

public class AliasTest {

	@Test
	public void testHelloWorld_InstanceFactory() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		HelloWorld hello = (HelloWorld)context.getBean("abc");
		hello.hello();
	}
}
