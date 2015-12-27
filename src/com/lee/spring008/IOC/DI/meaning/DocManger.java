package com.lee.spring008.IOC.DI.meaning;

public class DocManger {
	private Doc doc;

	public void readDoc() {
		this.doc.readDoc();
	}

	public void writeDoc() {
		this.doc.writeDoc();
	}

	public Doc getDoc() {
		return doc;
	}

	public void setDoc(Doc doc) {
		this.doc = doc;
	}
}
