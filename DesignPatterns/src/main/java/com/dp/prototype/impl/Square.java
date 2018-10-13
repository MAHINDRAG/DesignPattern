package com.dp.prototype.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Square.class);

	public Square() {
		type = "Square";
		logger.info("Type:{}",type);
	}
	
	@Override
	public void draw() {
       logger.info("Inside Square::draw() Method.");
	}

}
