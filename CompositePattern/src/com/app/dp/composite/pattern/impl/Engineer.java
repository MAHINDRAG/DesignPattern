package com.app.dp.composite.pattern.impl;

import com.app.dp.composite.pattern.Employee;

public class Engineer implements Employee {

	private String name,department;
	private long empId;


	public Engineer(String name, String department, long empId) {
		super();
		this.name = name;
		this.department = department;
		this.empId = empId;
	}


	@Override
	public void showEmployeeDetails() {
		System.out.println(empId+" ***** "+name+" ***** "+department);
	}

}
