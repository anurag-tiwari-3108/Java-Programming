package com.codex.lang.java.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationDemo {
	
	private static ObjectOutputStream oos;
	public static String FILE = "serialized-object.ser" ;
	public static void main(String []args) throws IOException, ClassNotFoundException{
		Dog d1 = new Dog();
		// Serialization
		FileOutputStream fos  = new FileOutputStream(Constants.IO.PATH+FILE);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		// Changing the variable after Serilization. To check serilization effect on them
		
		// Normal Params
		d1.age = 20;
		d1.name = "parlo";
		// Static Param
		d1.type = "padosi";		
// 		Final
//		d1.length="99mm";
// 		transient final static
//		d1.city = "Haryana";
// 		transient static
		d1.owner = "mohanchad";
		
		// De Serialization		
		System.out.println("D1 Age    : "+d1.age);
		System.out.println("D1 Length : "+d1.length);
		System.out.println("D1 Name   : "+d1.name);
		System.out.println("D1 State  : "+d1.state);
		System.out.println("D1 City   : "+d1.city);
		System.out.println("D1 Owner  : "+d1.owner);
		System.out.println("D1 Type   : "+d1.type);		
	}

}
