package com.lee.spring005.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	
	/**
	 * spring 容易中的bean默认是单例
	 * 单例的时候默认构造函数只会运行一次
	 */
	@Test
	public void testScope_Default() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		Scope scope1 = (Scope)context.getBean("scope");
		Scope scope2 = (Scope)context.getBean("scope");
	
		// hashcode 一致，表示单例
		System.out.println(scope1.hashCode());
		System.out.println(scope2.hashCode());
	}
	
	/**
	 * 多例下，在getBean() 的时候才会调用默认的构造函数
	 * 无论lazy-init 为什么值，都是在getBean() 的时候创建对象的
	 */
	@Test
	public void testScope_Prototype() {
		// 启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring创建类对象
		Scope scope1 = (Scope)context.getBean("scope_prototype");
		Scope scope2 = (Scope)context.getBean("scope_prototype");
	
		// hashcode 一致，表示单例
		System.out.println(scope1.hashCode());
		System.out.println(scope2.hashCode());
	}
}
