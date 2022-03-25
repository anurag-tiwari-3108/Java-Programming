package com.codex.lang.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configs {
	public static Configs _instance = null;
	static Properties PROP = new Properties();
	static InputStream INPUT = null;
	static String PATH = "C:/Users/AnrTiwari/Desktop/workspace/java/foundation/src/main/resource/configuration.properties";

			//"C:/Users/AnrTiwari/Desktop/workspace/java/activity/src/main/resource/migration.properties";

	private Configs() {
	}

	// Double checked singletone
	public synchronized static Configs getInstance() {
		if (_instance == null) {
			synchronized (Configs.class) {
				if (_instance == null) {
					_instance = new Configs();
				}

			}
		}

		return _instance;
	}

	public static String getConfig(String key) {
		loadProperties();
		String value = null;
		value = PROP.getProperty(key);
		return value;

	}

	private static void loadProperties() {
		try {
			INPUT = new FileInputStream(PATH);
			try {
				PROP.load(INPUT);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
