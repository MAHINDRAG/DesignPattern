package com.app.test;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegmeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegmeal.showItems();
		System.out.println("Total Cost:"+vegmeal.getCost());
		
		Meal nonVegmeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non VegMeal");
		nonVegmeal.showItems();
		System.out.println("Total Cost:"+nonVegmeal.getCost());
	}
}
