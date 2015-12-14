package com.lee.spring002.createobject.method;

import com.lee.spring001.createobject.HelloWorld;

public class HelloWorldFactory {

	/**
	 * ¼òµ¥¹¤³§
	 * @return
	 */
	public static HelloWorld getInstance() {
		return new HelloWorld();
	}
}
