package com.lee.spring002.createobject.method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.spring001.createobject.HelloWorld;

public class HelloWorldFactoryTest {

	/**
	 * 利用静态工厂模式创建对象
	 * <bean id="helloWorld2" class="com.lee.spring002.createobject.method.HelloWorldFactory" factory-method="getInstance"></bean>
	 * spring 容器通过getInstance创建对象，而具体的new过程是由程序员来完成的
	 */
	@Test
	public void testHelloWorld_StaticFactory() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld2");
		hello.hello();
	}
	
	@Test
	public void testHelloWorld_InstanceFactory() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld3");
		hello.hello();
	}
}
