package com.dp.chain;

public class CashDispenser {

	private int denominator;
	private CashDispenser next = null;

	public CashDispenser(int val) {
		System.out.println("Value:"+val);
		this.denominator = val;
	}

	public void setNextDispenser(CashDispenser d) {
		System.out.println("NEXT:"+next);
		if(next==null) {
			System.out.println("Dispenser:"+d);
			next = d;
		}else {
			System.out.println("Next:"+next);
			next.setNextDispenser(d);
		}
	}

	public void dispense(int amount) {
		System.out.println("Amount:"+amount+", Dispenser:"+denominator);
		try {
			if(amount >= denominator) {
				int num = amount / denominator;
				int balance = amount % denominator;
				System.out.println(num+"*"+denominator+"$");
				if(balance!=0) {
					System.out.println("Balance:"+balance);
					next.dispense(balance);
				}else {
					System.out.println("Amount:"+amount);
					next.dispense(amount);
				}
			}
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException:"+e);
		}catch(Exception e) {
			System.out.println("Exception occurred:"+e);
		}
	}
}
