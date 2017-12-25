package com.app.mobile.company.impl;

import com.app.common.expection.PluginException;
import com.app.mobile.company.MobileCompany;

public class Apple implements MobileCompany{

	@Override
	public String mobileModel(Integer amount) {
		System.out.println("Welcome to Apple showroom");
		if(amount == null){
			throw new PluginException(PluginException.amountRequired); 
		}
		if(amount>40000){
			System.out.println("Welcome to Iphone Eight plus");
		}else if(amount<40000 && amount>20000){
			System.out.println("Welcome to Iphone six ");
		}else if(amount<20000 && amount>10000){
			System.out.println("Welcome to Iphone five yes");
		}else{
			System.out.println("Welcome to Iphone four yes");
		}
		return "Thanks for purchasing Apple mobile";
	}

}
