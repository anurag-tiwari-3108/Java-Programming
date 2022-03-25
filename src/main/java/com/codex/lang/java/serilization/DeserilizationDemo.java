package com.codex.lang.java.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserilizationDemo {
	private static ObjectInputStream ois;
	public static String FILE = "serialized-object.ser" ;

	public static void main(String [] args) throws ClassNotFoundException, IOException{
		FileInputStream fis;
		try {
			fis = new FileInputStream(Constants.IO.PATH+FILE);
			ois = new ObjectInputStream(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Dog d2 = (Dog)ois.readObject();

		System.out.println("======================");
		
		System.out.println("D2 Age    : "+d2.age);
		System.out.println("D2 Length : "+d2.length);
		System.out.println("D2 Name   : "+d2.name);
		System.out.println("D2 State  : "+d2.state);
		System.out.println("D2 City   : "+d2.city);
		System.out.println("D2 Owner  : "+d2.owner);
		System.out.println("D2 Type   : "+d2.type);

		

	}

}
