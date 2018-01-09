package com.app.dp.facade.impl;

import com.app.dp.facade.MobileShop;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("J7Prime");
	}

	@Override
	public void price() {
	    System.out.println("RS 16500.00");
	}

}
