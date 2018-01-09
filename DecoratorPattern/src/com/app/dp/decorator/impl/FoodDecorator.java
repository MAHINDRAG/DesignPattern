package com.app.dp.decorator.impl;

import com.app.dp.decorator.Food;

public abstract class FoodDecorator implements Food {

	private Food newFood;
	
	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}

}
