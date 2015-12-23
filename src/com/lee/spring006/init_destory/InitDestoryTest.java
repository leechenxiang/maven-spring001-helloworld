package com.lee.spring006.init_destory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestoryTest {
	
	/**
	 * spring ��������ʱ���ڵ��ù��캯��������init
	 * spring ����û��close��bean�Ͳ�������
	 * spring ����close�ˣ�����ִ�и÷���֮ǰҪִ�����ٷ���
	 */
	@Test
	public void testInitDestory() {
		// ����spring ����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring ���������
		InitDestory initDestory = (InitDestory)context.getBean("initDestory");
		initDestory.hello();
		
		ClassPathXmlApplicationContext app = (ClassPathXmlApplicationContext)context;
		// spring ���׹ر�
		app.close();
	}
	
}
