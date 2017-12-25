package com.app.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.app.factory.AbstractFactory;
import com.app.factory.producer.FactoryProducer;
import com.app.mobile.company.MobileCompany;
import com.app.network.MobileNetWork;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		String network = null;
		String businessType = null;
		Integer amount = null;
		String rechargeType = null;
		String plan = null;
		String mcompany = null;
		Integer mamount = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AbstractFactory mcompanyFactory = FactoryProducer.getFactory("Mobile");
		AbstractFactory networkFactory = FactoryProducer.getFactory("Network");
		try {
			System.out.print("Enter your mobile Company:");
			mcompany = br.readLine();
			System.out.print("Enter your Amount for purchasing mobile:");
			mamount = Integer.parseInt(br.readLine());
			System.out.println("Entered Details for Mobile purchasing:");
			System.out.println("Company:"+mcompany+", Amount:"+mamount);
			System.out.print("Enter your network Name:");
			network = br.readLine();
			System.out.print("Enter your businsess Type:");
			businessType = br.readLine();
			System.out.print("Enter your Amount:");
			amount = Integer.parseInt(br.readLine());
			System.out.print("Enter your rechargeType:");
			rechargeType = br.readLine();
			System.out.print("Enter your plan:");
			plan = br.readLine();
			System.out.println("Entered Details are:");
			System.out.println("Network:"+network+", businessType:"+businessType+", amount"+amount+", rechargeType:"+rechargeType+", plan:"+plan);
			MobileCompany company = mcompanyFactory.getMobileCompany(mcompany);
			String mobilemsg = company.mobileModel(mamount);
			System.out.println("Mobile Company Message:"+mobilemsg);
			MobileNetWork factory = networkFactory.getNetwork(network);
			String resultmsg = factory.plan(businessType, amount, rechargeType, plan);
			System.out.println("Result Message:"+resultmsg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
