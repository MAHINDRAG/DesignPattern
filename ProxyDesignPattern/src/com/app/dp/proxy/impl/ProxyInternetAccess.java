package com.app.dp.proxy.impl;

import com.app.dp.proxy.OfficeInternetAccess;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realAccess;
    
	public ProxyInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
     if(getRole(employeeName)>4){
    	 realAccess = new RealInternetAccess(employeeName);
    	 realAccess.grantInternetAccess();
     }else{
    	 System.out.println("No Internet access granted. your job level is below 5");
     }

	}
	
	// Check role from the database based on Name and designation  
    // return job level or job designation.  
	public int getRole(String empName){
		return 9;
	}
}
