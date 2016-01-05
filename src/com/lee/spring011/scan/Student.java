package com.lee.spring011.scan;

import org.springframework.stereotype.Component;

@Component//("studentA")
public class Student {
	
	public void sayHello() {
		System.out.println("Hello! I am a student...nathan!");
	}

}
