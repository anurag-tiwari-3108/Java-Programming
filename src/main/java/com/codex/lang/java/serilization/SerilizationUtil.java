package com.codex.lang.java.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerilizationUtil {
	private static ObjectOutputStream oos;
	public static String FILE = "serialized-object.ser";
	private static ObjectInputStream ois;

	public static void serilize(Object obj) throws IOException {
		FileOutputStream fos = new FileOutputStream(Constants.IO.PATH + FILE);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);		
		System.out.println("SerilizationUtil :: "+obj.getClass().getSimpleName());
	}

	public static void deserilize(Object obj) throws ClassNotFoundException,IOException {

		FileInputStream fis;
		try {
			fis = new FileInputStream(Constants.IO.PATH + FILE);
			ois = new ObjectInputStream(fis);
			Object newObj = (Object)ois.read();
			System.out.println("SerilizationUtil ::"+newObj.getClass().getSimpleName());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
