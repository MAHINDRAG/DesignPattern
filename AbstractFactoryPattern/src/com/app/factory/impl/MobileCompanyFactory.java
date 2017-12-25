package com.app.factory.impl;

import com.app.factory.AbstractFactory;
import com.app.mobile.company.MobileCompany;
import com.app.mobile.company.impl.Apple;
import com.app.mobile.company.impl.Nokia;
import com.app.mobile.company.impl.Samsung;
import com.app.network.MobileNetWork;

public class MobileCompanyFactory extends AbstractFactory {

	@Override
	public MobileNetWork getNetwork(String networkType) {
		return null;
	}

	@Override
	public MobileCompany getMobileCompany(String mcompany) {
		if(mcompany == null){
			return null;
		}
		if(mcompany.equalsIgnoreCase("Samsung")){
			return new Samsung();
		}else if(mcompany.equalsIgnoreCase("Nokia")){
			return new Nokia();
		}else if(mcompany.equalsIgnoreCase("Apple")){
			return new Apple();
		}
		return null;
	}
}
