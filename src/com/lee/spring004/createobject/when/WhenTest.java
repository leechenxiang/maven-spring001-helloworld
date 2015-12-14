package com.lee.spring004.createobject.when;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WhenTest {

	
	/**
	 * �����Ϊ������Ϊ��������ʱ���ܷ��������Ƿ��д�
	 * 
	 * ��Ĭ������£�����spring���׵�ʱ�򴴽�����
	 * Ҳ����˵������������ʱ�����applicationContext.xml�����е�bean���������Щbean��Ĭ�Ϲ��췽��
	 */
	@Test
	public void testWhen() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		When when = (When)context.getBean("when");
		when.show();
	}
	
	/**
	 * ������� lazy-init="true"����ôֻ���ڵ���bean�ķ�����ʱ����ù��캯��
	 */
	@Test
	public void testWhen_Lazy() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		When when = (When)context.getBean("when2");
		when.show();
	}
}
