package com.app.factory.impl;

import com.app.factory.AbstractFactory;
import com.app.mobile.company.MobileCompany;
import com.app.network.MobileNetWork;
import com.app.network.impl.Airtel;
import com.app.network.impl.Idea;
import com.app.network.impl.TataDocomo;

public class MobileNetworkFactory extends AbstractFactory {

	@Override
	public MobileNetWork getNetwork(String networkType) {
		if(networkType == null){
			return null;
		}
		if(networkType.equalsIgnoreCase("Airtel")){
			return new Airtel();
		}else if(networkType.equals("TataDocomo")){
			return new TataDocomo();
		}else if(networkType.equalsIgnoreCase("Idea")){
			return new Idea();
		}
		return null;
	}

	@Override
	public MobileCompany getMobileCompany(String mcompany) {
		return null;
	}
}
