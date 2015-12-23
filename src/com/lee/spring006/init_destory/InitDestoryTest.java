package com.lee.spring006.init_destory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestoryTest {
	
	/**
	 * spring 容器启动时，在调用构造函数后会调用init
	 * spring 容器没有close，bean就不会销毁
	 * spring 容器close了，则在执行该方法之前要执行销毁方法
	 */
	@Test
	public void testInitDestory() {
		// 启动spring 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring 创建类对象
		InitDestory initDestory = (InitDestory)context.getBean("initDestory");
		initDestory.hello();
		
		ClassPathXmlApplicationContext app = (ClassPathXmlApplicationContext)context;
		// spring 容易关闭
		app.close();
	}
	
}
