package com.app.journaldev.dp.template;

public abstract class HouseTemplate {

	//methods to be implemented by subclasses
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		System.out.println("House is built");
	}
	
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	//methods to be implemented by subclasses
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	public void buildFoundation() {
		System.out.println("Building foundation with cement iron rods and sand");
	}
}
