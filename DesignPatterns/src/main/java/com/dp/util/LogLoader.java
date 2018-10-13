package com.dp.util;

import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogLoader {

	private static final Logger logger = LoggerFactory.getLogger(LogLoader.class);
	public static boolean logFlag = false;

	public static void loadLog() {
		if(logFlag) {
			logger.info("Log file is already Initialized..");
		}else {
			logger.info("Log file is initializing..");
			logFlag = true;
			try {
				DOMConfigurator.configure("src/main/resources/log4j.xml");	
			}catch(Exception e) {
				logger.error("Error while loading log4j file.");
			}
		}

	}

}
