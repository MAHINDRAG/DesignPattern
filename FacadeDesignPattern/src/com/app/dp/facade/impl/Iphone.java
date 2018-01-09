package com.app.dp.facade.impl;

import com.app.dp.facade.MobileShop;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Iphone10");
	}

	@Override
	public void price() {
		System.out.println("RS 96000.00");
	}

}
