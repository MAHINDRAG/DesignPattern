package com.app.test;

import com.app.item.impl.ChickenBurger;
import com.app.item.impl.Coke;
import com.app.item.impl.Pepsi;
import com.app.item.impl.VegBurger;

public class MealBuilder {
	Meal meal = new Meal();
	public Meal prepareVegMeal(){
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;		
	}
	
	public Meal prepareNonVegMeal(){
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
		
	}
}
