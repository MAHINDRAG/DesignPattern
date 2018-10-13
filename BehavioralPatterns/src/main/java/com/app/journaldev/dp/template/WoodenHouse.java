package com.app.journaldev.dp.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
       System.out.println("Building Pillars with wooden coating");
	}

	@Override
	public void buildWalls() {
      System.out.println("Building Wooden walls");
	}

}
