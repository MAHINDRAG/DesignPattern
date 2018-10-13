package com.dp.prototype.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);
    
	public Rectangle() {
		type = "Rectangle";
		logger.info("Type:{}",type);
	}
	@Override
	public void draw() {
		logger.info("Inside Rectangle::draw() method.");
	}

}
