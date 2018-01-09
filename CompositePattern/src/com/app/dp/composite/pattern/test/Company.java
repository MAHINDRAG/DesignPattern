package com.app.dp.composite.pattern.test;

import com.app.dp.composite.pattern.impl.Accountant;
import com.app.dp.composite.pattern.impl.CompanyDirector;
import com.app.dp.composite.pattern.impl.Engineer;

public class Company {

	public static void main(String[] args) {
		Engineer eng1 = new Engineer("Mahindra", "PE", 2484);
		Engineer eng2 = new Engineer("Karthik", "UI", 2548);
		CompanyDirector engDirector = new CompanyDirector();
		engDirector.addEmployee(eng1);
		engDirector.addEmployee(eng2);

		Accountant acc1 = new Accountant("GOPI", "Finance", 3625);
		Accountant acc2 = new Accountant("Vinoth", "Finance", 2658);
		CompanyDirector accDirector = new CompanyDirector();
		accDirector.addEmployee(acc1);
		accDirector.addEmployee(acc2);

		CompanyDirector director = new CompanyDirector();
		director.addEmployee(engDirector);
		director.addEmployee(accDirector);
		director.showEmployeeDetails();
	}

}
