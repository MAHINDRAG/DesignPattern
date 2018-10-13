package com.app.journaldev.dp.memonto;

public class Momento {

	String fileName;
	private StringBuilder content;
	
	public Momento(String file, StringBuilder content) {
		this.fileName = file;
		this.content = new StringBuilder(content);
	}

	public String getFileName() {
		return fileName;
	}

	public StringBuilder getContent() {
		return content;
	}
	
	
}
