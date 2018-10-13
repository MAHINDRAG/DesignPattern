package com.dp.prototype.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Shape implements Cloneable{

	private static final Logger logger = LoggerFactory.getLogger(Shape.class);

	private String id;
	public String type;

	abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
			logger.info("Clone Method:"+clone);
		}catch (CloneNotSupportedException e) {
			logger.error("CloneNotSupportedException Occurred inside clone Method:{}",e);
		}
		return super.clone();
	}

}
