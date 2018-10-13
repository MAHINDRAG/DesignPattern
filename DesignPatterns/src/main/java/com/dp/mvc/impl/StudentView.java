package com.dp.mvc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentView {

	private static final Logger logger = LoggerFactory.getLogger(StudentView.class);

	public void printStudentDetails(String studentName, String studentRollNo){	
		logger.info("Student Details: Name:{} , RollNo:{}",studentName,studentRollNo);
	}
}
