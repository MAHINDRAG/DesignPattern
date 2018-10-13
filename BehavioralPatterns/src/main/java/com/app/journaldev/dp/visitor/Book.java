package com.app.journaldev.dp.visitor;

public class Book implements ItemElement{

	private int price;
	private String isbNumber;
	
	public Book(int price, String isbNumber) {
		super();
		System.out.println(this);
		this.price = price;
		this.isbNumber = isbNumber;
	}

	public int getPrice() {
		return price;
	}


	public String getIsbNumber() {
		return isbNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		System.out.println("This:"+this);
		return visitor.visit(this);
	}
	
	
}
