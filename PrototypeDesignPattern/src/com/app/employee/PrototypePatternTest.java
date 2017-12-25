package com.app.employee;

public class PrototypePatternTest {

	public static void main(String[] args) {
		try {
			Employee emp = new Employee(101, "Adithya");
			Employee cloneEmp1 = (Employee) emp.clone();
			System.out.println("Original Object:"+emp.getEmpId()+","+emp.getName());
			System.out.println("Duplicate Object:"+cloneEmp1.getEmpId()+","+cloneEmp1.getName());
		    System.out.println("Changes Happing on Clone object then original object does not change");
			cloneEmp1.setEmpId(2484);
		    cloneEmp1.setName("Mahindra");
		    System.out.println("Original Object:"+emp.getEmpId()+","+emp.getName());
			System.out.println("Duplicate Object:"+cloneEmp1.getEmpId()+","+cloneEmp1.getName());
	        System.out.println("Changes happening on Original object , Observe below Changes");
	        emp.setEmpId(2569);
	        emp.setName("karthik");
	        System.out.println("Original Object:"+emp.getEmpId()+","+emp.getName());
			System.out.println("Duplicate Object:"+cloneEmp1.getEmpId()+","+cloneEmp1.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
