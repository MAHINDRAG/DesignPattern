package com.dp.prototype.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {

	private static final Logger logger = LoggerFactory.getLogger(Circle.class);
	
	public Circle() {
	  type = "Circle";
	  logger.info("Type:{}",type);
	}
	@Override
	public void draw() {
      logger.info("Inside Circle ::draw() Method. ");
	}

}
