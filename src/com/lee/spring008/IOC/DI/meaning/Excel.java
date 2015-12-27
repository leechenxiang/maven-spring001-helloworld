package com.lee.spring008.IOC.DI.meaning;

public class Excel implements Doc {

	@Override
	public void readDoc() {
		System.out.println("read excel");
	}

	@Override
	public void writeDoc() {
		System.out.println("write excel");
	}

}
