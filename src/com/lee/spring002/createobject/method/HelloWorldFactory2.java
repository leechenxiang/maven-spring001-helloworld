package com.lee.spring002.createobject.method;

import com.lee.spring001.createobject.HelloWorld;

public class HelloWorldFactory2 {

	/**
	 * ʵ������
	 * @return
	 */
	public HelloWorld getInstance() {
		return new HelloWorld();
	}
}
