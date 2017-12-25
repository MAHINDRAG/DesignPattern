package com.app.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
  public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.print("Enter Employee ID :");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter Employee Name :");
		String name = br.readLine();
		System.out.print("Enter Employee Designation :");
		String designation = br.readLine();
		System.out.print("Enter Employee Salary :");
		double salary = Double.parseDouble(br.readLine());
		System.out.print("Enter Employee Address :");
		String address = br.readLine();
		EmployeeRecord e1 = new EmployeeRecord(id,name,designation,salary,address);
		e1.showRecord();
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e){
		e.printStackTrace();
	}
}
}
