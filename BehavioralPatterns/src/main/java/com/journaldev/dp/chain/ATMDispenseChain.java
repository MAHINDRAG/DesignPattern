package com.journaldev.dp.chain;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			if(amount % 10!=0) {
				System.out.println("Amount should be multiple of 10s");
				return;
			}

			atmDispenseChain.c1.dispense(new Currency(amount));
            scanner.close();
		
	}

}
