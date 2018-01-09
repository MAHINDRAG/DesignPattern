package com.app.dp.decorator.impl;

import com.app.dp.decorator.Food;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 55.0;
	}

}
