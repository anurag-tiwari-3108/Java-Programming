package com.codex.lang.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.codex.*;

public class ConstructorSerilizationDemo {
	public static String FILE = "serialized-object.ser" ;
	
	public static void main(String [] args) throws IOException, ClassNotFoundException{
		ConstructorSerilization cons = new ConstructorSerilization();
		FileOutputStream fos = new FileOutputStream(Constants.IO.PATH+FILE);
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(cons);
		oos.close();
		
		System.out.println("Before Modify "+cons.check);		
		cons.modifyValue();
		System.out.println("After Modify "+cons.check);
		
		
		FileInputStream fis  = new FileInputStream(Constants.IO.PATH+FILE);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ConstructorSerilization desiCons  = (ConstructorSerilization)ois.readObject();
		System.out.println("After Deserial "+cons.check);
		System.out.println("After Deserial "+desiCons.check);
		ois.close();		
		
	}
}
