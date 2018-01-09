package com.app.impl;

import com.app.DrawAPI;

public abstract class Shape {

	public DrawAPI drawAPI;
	
	public  Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
