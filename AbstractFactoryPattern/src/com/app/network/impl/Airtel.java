package com.app.network.impl;

import java.util.Random;

import com.app.common.expection.PluginException;
import com.app.network.MobileNetWork;

public class Airtel implements MobileNetWork{

	@Override
	public String plan(String businessType, Integer amount, String rechargeType, String plans) {
		if(businessType == null){
			throw new PluginException(PluginException.businessType); 
		}
		if(amount == null){
			throw new PluginException(PluginException.amountRequired); 
		}
		System.out.println("Welcome to Airtel "+businessType+" subscriber");
		if(businessType.equalsIgnoreCase("prepaid")){
			if(rechargeType ==null){
				throw new PluginException(PluginException.rechargeType);
			}
			if(plans == null){
				throw new PluginException(PluginException.plans);
			}
			switch (plans) {
			case "FULLTT":
				if(amount>50){
					System.out.println("Recharge Done Successfully:"+new Random().nextInt(345673));
				}else{
					System.out.println("TOP UP Recharge happend because amount is less than minimum Amount:"+new Random().nextInt(100000));
				}
				break;
			case "TOPUP":
				System.out.println("Topup recharge done successfully with reference ID:"+new Random().nextInt(78469));
				break;
			case "Data":
				System.out.println("Data recharge done Successfully:"+new Random().nextInt(639854));
				break;
			default:
				System.out.println("Special Recharge done Successfully through "+rechargeType);
				break;
			}
		}else{
			if(amount>400){
				System.out.println("Subscriber eligible for unlimited Data , voice and SMS per month");
			}else if(amount<400 & amount>200){
				System.out.println("Subscriber eligible for 1 GB Data , 200 mins voice calls and 20 SMS per day");
			}
		}

		return "Thanks for using Airtel network";
	}
}
