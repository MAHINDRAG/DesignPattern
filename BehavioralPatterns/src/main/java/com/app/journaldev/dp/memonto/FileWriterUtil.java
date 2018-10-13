package com.app.journaldev.dp.memonto;

public class FileWriterUtil {

	private String name;
	private StringBuilder content;
	
	public FileWriterUtil(String file) {
		super();
		this.name = file;
		this.content = new StringBuilder();
	}
	
	public void write(String str) {
		content.append(str);
	}
	
	public void undoToLastSave(Object obj) {
		Momento momento = (Momento) obj;
		this.name = momento.getFileName();
		this.content = momento.getContent();
	}
	
	@Override
	public String toString() {
		return this.content.toString();
	}
	
	public Momento save() {
		return new Momento(this.name, this.content);
	}
	
	
}
