package com.app.employee;

public class Employee implements Cloneable {
	private Integer empId;
	private String name;
	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
