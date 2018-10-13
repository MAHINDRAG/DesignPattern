package com.dp.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dp.prototype.impl.Shape;
import com.dp.prototype.impl.ShapeCache;
import com.dp.util.LogLoader;

public class PrototypePatternDemo {

	private static final Logger logger = LoggerFactory.getLogger(PrototypePatternDemo.class);
	
	public static void main(String[] args) {
		
		try {
			LogLoader.loadLog();
		}catch(Exception e) {
			logger.error("Exception occurred while loading log Method:{}",e);
		}
		
		long startTime = System.currentTimeMillis();
		logger.info("StartTime:{}",startTime);
		
		ShapeCache.loadCache();
		Shape clonedShape1 = ShapeCache.getShape("1");
		logger.info("Shape:{}",clonedShape1.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		logger.info("Shape:{}",clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		logger.info("Shape:{}",clonedShape3.getType());
		
		long endTime = System.currentTimeMillis();
		logger.info("endTime:{}",endTime);
		logger.info("Total Time taken by ProtoType Design Pattern:{}",(endTime-startTime));
	}
}
