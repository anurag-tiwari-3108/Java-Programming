package com.codex.lang.java.reflection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configs {

	public static String getStringProperties(String prefix) {
		Properties aProp = new Properties();
		InputStream input = null;
		String returnString = null;
		try {
			input = new FileInputStream("system_configs.properties");
			aProp.load(input);
			returnString = aProp.getProperty(prefix);
		} catch (Exception ex) {
			System.out.println("Exception " + ex);
		}
		return returnString;
	}

	public static String[] getArrayProperties(String prefix) {
		Properties aProp = new Properties();
		InputStream input = null;
		String value = null;
		String[] valueList = null;
		try {
			input = new FileInputStream("system_configs.properties");
			aProp.load(input);
			value = aProp.getProperty(prefix);
			valueList = value.split(",");
		} catch (Exception ex) {
			System.out.println("Exception " + ex);
		}
		return valueList;
	}
}