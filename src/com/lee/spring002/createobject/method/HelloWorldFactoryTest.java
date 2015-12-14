package com.lee.spring002.createobject.method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.spring001.createobject.HelloWorld;

public class HelloWorldFactoryTest {

	/**
	 * ���þ�̬����ģʽ��������
	 * <bean id="helloWorld2" class="com.lee.spring002.createobject.method.HelloWorldFactory" factory-method="getInstance"></bean>
	 * spring ����ͨ��getInstance�������󣬶������new�������ɳ���Ա����ɵ�
	 */
	@Test
	public void testHelloWorld_StaticFactory() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld2");
		hello.hello();
	}
	
	@Test
	public void testHelloWorld_InstanceFactory() {
		// ����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring���������
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld3");
		hello.hello();
	}
}
