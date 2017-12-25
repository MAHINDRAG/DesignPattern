package com.app;

 public abstract class Plan {
	protected double rate;
	public abstract void getRate();
	
	public long calculateBill(int units){
		System.out.println("Total Amount:"+units*rate);
		return (long) (units*rate);
	}

}
