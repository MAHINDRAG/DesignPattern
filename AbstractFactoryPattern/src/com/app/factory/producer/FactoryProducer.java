package com.app.factory.producer;

import com.app.factory.AbstractFactory;
import com.app.factory.impl.MobileCompanyFactory;
import com.app.factory.impl.MobileNetworkFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Network")){
			return new MobileNetworkFactory();
		}else if(choice.equalsIgnoreCase("Mobile")){
			return new MobileCompanyFactory();
		}
		return null;		
	}
}
