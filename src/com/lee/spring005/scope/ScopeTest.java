package com.lee.spring005.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	
	/**
	 * spring �����е�beanĬ���ǵ���
	 * ������ʱ��Ĭ�Ϲ��캯��ֻ������һ��
	 */
	@Test
	public void testScope_Default() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		Scope scope1 = (Scope)context.getBean("scope");
		Scope scope2 = (Scope)context.getBean("scope");
	
		// hashcode һ�£���ʾ����
		System.out.println(scope1.hashCode());
		System.out.println(scope2.hashCode());
	}
	
	/**
	 * �����£���getBean() ��ʱ��Ż����Ĭ�ϵĹ��캯��
	 * ����lazy-init Ϊʲôֵ��������getBean() ��ʱ�򴴽������
	 */
	@Test
	public void testScope_Prototype() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		Scope scope1 = (Scope)context.getBean("scope_prototype");
		Scope scope2 = (Scope)context.getBean("scope_prototype");
	
		// hashcode һ�£���ʾ����
		System.out.println(scope1.hashCode());
		System.out.println(scope2.hashCode());
	}
}
