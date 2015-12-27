package com.lee.spring008.IOC.DI.meaning;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocTest {

	@Test
	public void testDoc_is_not_spring() {
		// 不完全的面向接口编程
		Doc doc = new Word();
		DocManger dm = new DocManger();
		dm.setDoc(doc);
		dm.writeDoc();
		dm.readDoc();
	}
	
	/**
	 * IOC控制反转和DI依赖注入的真正意义：完全面向接口编程
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
