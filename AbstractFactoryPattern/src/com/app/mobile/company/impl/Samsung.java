package com.app.mobile.company.impl;

import com.app.common.expection.PluginException;
import com.app.mobile.company.MobileCompany;

public class Samsung implements MobileCompany{

	@Override
	public String mobileModel(Integer amount) {
		System.out.println("Welcome to Samsung showroom");
		if(amount == null){
			throw new PluginException(PluginException.amountRequired); 
		}
		if(amount>20000){
			System.out.println("Welcome to SamSung Edge");
		}else if(amount<20000 && amount>15000){
			System.out.println("Welcome to Samsung J7 prime");
		}else if(amount<15000 && amount>5000){
			System.out.println("Welcome to Samsung Duos");
		}else{
			System.out.println("Welcome to Samsung 2211 model");
		}
		return "Thanks for purchasing Samsung mobile";
	}

}
