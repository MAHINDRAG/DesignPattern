package com.dp.chain;

import java.util.Scanner;

public class ChainClient {

	public static void main(String[] args) {
		CashDispenser cashDispenser = new CashDispenser(100);
		cashDispenser.setNextDispenser(new CashDispenser(50));
		cashDispenser.setNextDispenser(new CashDispenser(20));
		cashDispenser.setNextDispenser(new CashDispenser(10));
		cashDispenser.setNextDispenser(new CashDispenser(5));
		cashDispenser.setNextDispenser(new CashDispenser(2));
		cashDispenser.setNextDispenser(new CashDispenser(1));

		int amount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount");
		amount = scanner.nextInt();

		cashDispenser.dispense(amount);

		scanner.close();

	}

}
