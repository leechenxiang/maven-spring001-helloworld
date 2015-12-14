package com.lee.spring004.createobject.when;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WhenTest {

	
	/**
	 * 用这个为主，因为在启动的时候能发现配置是否有错
	 * 
	 * 在默认情况下，启动spring容易的时候创建对象
	 * 也就是说，启动容器的时候加载applicationContext.xml中所有的bean，会调用这些bean的默认构造方法
	 */
	@Test
	public void testWhen() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		When when = (When)context.getBean("when");
		when.show();
	}
	
	/**
	 * 如果加上 lazy-init="true"，那么只有在调用bean的方法的时候调用构造函数
	 */
	@Test
	public void testWhen_Lazy() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		When when = (When)context.getBean("when2");
		when.show();
	}
}
