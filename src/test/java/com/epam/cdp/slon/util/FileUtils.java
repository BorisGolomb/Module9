package com.epam.cdp.slon.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.codec.Charsets;

public class FileUtils {

	public static Properties loadProperties(String path) {
		Properties result = new Properties();
		InputStream inputStream = Config.class.getClassLoader().getResourceAsStream(path);
		InputStreamReader in = new InputStreamReader(inputStream, Charsets.UTF_8);
		try {
			result.load(inputStream); // load(in);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return result;
	}
}
