package com.lee.spring011.scan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	/**
	 * 原理
	 *   1、启动spring容器，spring容器解析配置文件
	 *   2、当解析到<context:component-scan base-package="com.itheima12.spring.scan">
	   			</context:component-scan>
	   	     就会在上面指定的包及子包中扫描所有的类，看哪些类上面有@Component注解
	   	 3、如果有该注解，则有如下的规则：
	   	      @Component
	   	      public class PersonDaoImpl{
	   	      
	   	      }
	   	      ==
	   	      <bean id="personDaoImpl" class"..."/>   id的值：把类的第一个字母变成小写，其他字母不变
	   	      
	   	      @Component("personDao")
	   	      public class PersonDaoImpl{
	   	      
	   	      }
	   	      ==
	   	      <bean id="personDao"  class=".."/>
	   	  4、按照@Resource注解的规则进行赋值
	 * @author zd
	 *
	 */
	@Test
	public void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-scan.xml");
		Person personA = (Person)context.getBean("person");
//		personA.getStudentA().sayHello();
		personA.tell();
	}

}
