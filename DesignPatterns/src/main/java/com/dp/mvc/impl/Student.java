package com.dp.mvc.impl;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	private String rollNo;
	private String name;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
