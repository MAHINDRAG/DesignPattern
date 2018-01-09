package com.app.impl;

import com.app.DrawAPI;

public class Circle extends Shape {
	private int x,y,radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawAPI = drawAPI;
	}

	@Override
	public void draw() {
	  drawAPI.drawCircle(radius, x, y);
	}

}
