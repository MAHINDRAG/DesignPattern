package com.app.dp.facade.demo;

import com.app.dp.facade.MobileShop;
import com.app.dp.facade.impl.BlackBerry;
import com.app.dp.facade.impl.Iphone;
import com.app.dp.facade.impl.Samsung;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;

	public ShopKeeper(){
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new BlackBerry();
	}

	public void iphoneSale(){
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale(){
		samsung.modelNo();
		samsung.price();
	}

	public void blackberrySale(){
		blackberry.modelNo();
		blackberry.price();
	}
}
