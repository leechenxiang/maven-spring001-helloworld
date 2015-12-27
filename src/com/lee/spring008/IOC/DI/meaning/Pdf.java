package com.lee.spring008.IOC.DI.meaning;

public class Pdf implements Doc {

	@Override
	public void readDoc() {
		System.out.println("read pdf");
	}

	@Override
	public void writeDoc() {
		System.out.println("write pdf");
	}

}
