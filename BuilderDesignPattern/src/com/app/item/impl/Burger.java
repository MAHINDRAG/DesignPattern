package com.app.item.impl;

import com.app.item.Item;
import com.app.item.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
