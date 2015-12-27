package com.lee.spring008.IOC.DI.meaning;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocTest {

	@Test
	public void testDoc_is_not_spring() {
		// ����ȫ������ӿڱ��
		Doc doc = new Word();
		DocManger dm = new DocManger();
		dm.setDoc(doc);
		dm.writeDoc();
		dm.readDoc();
	}
	
	/**
	 * IOC���Ʒ�ת��DI����ע����������壺��ȫ����ӿڱ��
	 * 
	 */
	@Test
	public void testDoc_is_spring() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocManger docManger = (DocManger)context.getBean("docManger");
		docManger.writeDoc();
		docManger.readDoc();
		
	}

}
