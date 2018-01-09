package com.app.item.impl;

import com.app.item.Item;
import com.app.item.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
