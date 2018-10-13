package com.dp.prototype.impl;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author gopisma
 * This class is used to get concrete classes from database and store them in a Hashtable.
 */
public class ShapeCache {

	private static final Logger logger = LoggerFactory.getLogger(ShapeCache.class);
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		try {
			cachedShape = (Shape) cachedShape.clone();
			logger.info("CachedShape:{}",cachedShape);
			return cachedShape;
		} catch (CloneNotSupportedException e) {
			logger.error("CloneNotSupported Exception Occured:{}",e);
		}
		return cachedShape;		
	}
	
	public static void loadCache() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
		logger.info("ShapeMap :{}",shapeMap);
	}
}
