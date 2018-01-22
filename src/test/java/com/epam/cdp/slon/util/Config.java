package com.epam.cdp.slon.util;

import java.util.Properties;

public class Config {

	private static Properties config;
	
	public static int getIntProperty(String key) {
		return Integer.parseInt(getProperty(key));
	}
	
	public static String getProperty(String key) {
		return getProperty(key, null);
	}
	
	public static String getProperty(String key, String defaultValue) {
		String propertyValue = defaultValue;
		if (config == null) {
			config = FileUtils.loadProperties("configuration.properties");
		}
		if (config.containsKey(key)) {
			propertyValue = config.getProperty(key);
		}
		
		return propertyValue;
	}
}
