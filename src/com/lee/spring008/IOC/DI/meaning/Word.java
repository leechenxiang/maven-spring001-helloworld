package com.lee.spring008.IOC.DI.meaning;

public class Word implements Doc {

	@Override
	public void readDoc() {
		System.out.println("read word");
	}

	@Override
	public void writeDoc() {
		System.out.println("write word");
	}

}
