package com.dp.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dp.mvc.impl.Student;
import com.dp.mvc.impl.StudentController;
import com.dp.mvc.impl.StudentView;

public class MVCPatternDemo {

	private static final Logger logger = LoggerFactory.getLogger(MVCPatternDemo.class);

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		logger.info("StartTime:{}",startTime);
		
		Student model = retriveStudentFromDatabase(); //fetch student record based on his roll no from the database
		StudentView view = new StudentView();   //Create a view : to write student details on console
		StudentController controller = new StudentController(model, view);
		controller.updateView();

		//update view 
		controller.setStudentName("Mahindra");
		controller.setStudentRollNo("101");
		controller.updateView();

		long endTime = System.currentTimeMillis();
		logger.info("endTime:{}",endTime);
		logger.info("Total Time taken by ProtoType Design Pattern:{}",(endTime-startTime));
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setRollNo("100");
		student.setName("Gopisetty");
		return student;
	}
}
