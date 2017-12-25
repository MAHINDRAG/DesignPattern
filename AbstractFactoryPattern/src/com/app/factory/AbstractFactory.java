package com.app.factory;

import com.app.mobile.company.MobileCompany;
import com.app.network.MobileNetWork;

public abstract class AbstractFactory {

	public abstract MobileNetWork getNetwork(String networkType);
	public abstract MobileCompany getMobileCompany(String mcompany);
}
