package com.app.journaldev.dp.visitor;

public class shoppingCartClient {

	public static void main(String[] args) {
		
		ItemElement items[] = new ItemElement[]
				{
				    new Book(20, "1234"),new Book(30, "7768"),
				    new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")
			   };
		int total = calculatePriceItems(items);
		System.out.println("Total Cost:"+total);
		
	}

	private static int calculatePriceItems(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for(ItemElement item:items) {
			sum += item.accept(visitor);
		}
		return sum;
	}

}
