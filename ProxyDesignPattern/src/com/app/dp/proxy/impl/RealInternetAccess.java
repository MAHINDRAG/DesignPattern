package com.app.dp.proxy.impl;

import com.app.dp.proxy.OfficeInternetAccess;

public class RealInternetAccess implements OfficeInternetAccess {

	private String empName;

	public RealInternetAccess(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for Employee:"+ empName);
	}

}
