package com.app.mobile.company.impl;

import com.app.common.expection.PluginException;
import com.app.mobile.company.MobileCompany;

public class Nokia implements MobileCompany{

	@Override
	public String mobileModel(Integer amount) {
		System.out.println("Welcome to Nokia showroom");
		if(amount == null){
			throw new PluginException(PluginException.amountRequired); 
		}
		if(amount>40000){
			System.out.println("Welcome to Nokia Eight plus");
		}else if(amount<40000 && amount>20000){
			System.out.println("Welcome to Nokia six ");
		}else if(amount<20000 && amount>10000){
			System.out.println("Welcome to Nokia five yes");
		}else{
			System.out.println("Welcome to Nokia four yes");
		}
		return "Thanks for purchasing Nokia mobile";
	}

}
