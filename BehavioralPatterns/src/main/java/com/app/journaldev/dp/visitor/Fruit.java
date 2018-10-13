package com.app.journaldev.dp.visitor;

public class Fruit implements ItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		System.out.println("This:"+this);
		return visitor.visit(this);
	}
	
    	
}
