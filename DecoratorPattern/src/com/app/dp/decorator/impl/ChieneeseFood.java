package com.app.dp.decorator.impl;

import com.app.dp.decorator.Food;

public class ChieneeseFood extends FoodDecorator {

	public ChieneeseFood(Food newFood) {
		super(newFood);
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood()+" With Fried Rice and Manchurian";
	}
	
	@Override
	public double foodPrice() {
		return super.foodPrice()+456.2;
	}

}
