package com.app.journaldev.dp.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		if(book.getPrice() > 50) {  // apply 5$ discount if book price greater than 50
			cost = book.getPrice() - 5;	
		}else {
			cost = book.getPrice();
		}
		System.out.println("Book ISBN:"+book.getIsbNumber()+", Cost:"+book.getPrice());
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("fruit Name:"+fruit.getName()+", Cost:"+cost+", NumberOfkg's:"+fruit.getWeight());
		return cost;
	}

}
