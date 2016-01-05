package com.lee.spring010.DI.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	/**
	 * 原理
	 *    1、当启动spring容器的时候，创建两个对象
	 *    2、当spring容器解析到
	 *    		 <context:annotation-config></context:annotation-config>
	 *        spring容器会在spring容器管理的bean的范围内查找这些类的属性上面是否加了@Resource注解
	 *    3、spring解析@Resource注解的name属性
	 *    		如果name属性为""
	 *              说明该注解根本没有写name属性
	 *              spring容器会得到该注解所在的属性的名称和spring容器中的id做匹配，如果匹配成功，则赋值
	 *                                                               如果匹配不成功,则按照类型进行匹配
	 *          如果name属性的值不为""
	 *               则按照name属性的值和spring的id做匹配，如果匹配成功，则赋值，不成功，则报错
	 *   说明:
	 *       注解只能用于引用类型
	 *       注解写法比较简单,但是效率比较低
	 *       xml写法比较复杂，但是效率比较高
	 */
	@Test
	public void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person personA = (Person)context.getBean("personA");
//		personA.getStudentA().sayHello();
		personA.tell();
	}

}
