package com.app.impl;

import com.app.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
	 System.out.println("Drawing Cricle[color:green, radius:"+radius+", x:"+x+", y="+y+"]");
	}

}
