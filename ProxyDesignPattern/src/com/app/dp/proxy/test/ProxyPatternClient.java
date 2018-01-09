package com.app.dp.proxy.test;

import com.app.dp.proxy.OfficeInternetAccess;
import com.app.dp.proxy.impl.ProxyInternetAccess;

public class ProxyPatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Mahindra");
        access.grantInternetAccess();
	}

}
