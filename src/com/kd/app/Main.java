package com.kd.app;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	private static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath*:applicationCtx.mxl");
		logger.info(appCtx);
	}
}
