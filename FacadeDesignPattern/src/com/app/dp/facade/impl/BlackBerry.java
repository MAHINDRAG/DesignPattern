package com.app.dp.facade.impl;

import com.app.dp.facade.MobileShop;

public class BlackBerry implements MobileShop {

	@Override
	public void modelNo() {
       System.out.println("BlackBerry z10");
	}

	@Override
	public void price() {
      System.out.println("RS 55500.00");
	}

}
