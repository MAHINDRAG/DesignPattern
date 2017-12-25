package com.app.impl.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.app.Plan;

public class GenerateBill {
  public static void main(String[] args) {
	GetPlanFactory planFactory = new GetPlanFactory();
	System.out.print("Enter the name of plan for which the bill will be  Generated :");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String planName = br.readLine();
		System.out.println("Entered Plan Name:"+planName);
		System.out.print("Enter the number of units for will be calculated :");
		int units = Integer.parseInt(br.readLine());
		Plan plan = planFactory.getPlan(planName);
		System.out.println("Bill Amount for "+planName+" of "+units+" units is:");
		if(plan!=null){
		plan.getRate();
		}else{
			throw new NullPointerException();
		}
		plan.calculateBill(units);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
