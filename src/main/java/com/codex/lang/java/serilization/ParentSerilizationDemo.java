package com.codex.lang.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * 1) If parent implements serializable then all the child will automatically get serialized. i.e httpservelet,
 * genericeservlet implements serializable that is why all the servlets automatically serialized.
 * 
 * 2) if any child is serializable but its parent is not then only child will get serilized and if any param 
 * which is from parent(non serilizable area) then JVM ignore its value and assign the default value to it.
 * like int i = 0 or String a = null;
 * 
 * If the parent is not serilizable then jvm call instance control flow and share its instance varibale to 
 * the current object 
 * 
 * If the non serilizable parent doesn't contain no-arg constructor then we get invalid class exception
 * 
 * @author ANRTIWARI
 *
 */
public class ParentSerilizationDemo {

	
	public static String FILE = "serialized-object.ser" ;
	public static void main(String ... args) throws IOException, ClassNotFoundException{
		ParentSerilizationImpl parentSerImpl = new ParentSerilizationImpl();
		System.out.println("Username : "+parentSerImpl.username+" | Password : "+parentSerImpl.password);
		System.out.println("Name : "+parentSerImpl.name+" | Type : "+parentSerImpl.type);
		FileOutputStream fos = new FileOutputStream(Constants.IO.PATH+FILE);
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(parentSerImpl);
		
		FileInputStream fis  = new FileInputStream(Constants.IO.PATH+FILE);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ParentSerilizationImpl parentDeSerImpl = (ParentSerilizationImpl)ois.readObject();
		System.out.println("Username : "+parentDeSerImpl.username+" | Password : "+parentDeSerImpl.password);
		System.out.println("Name : "+parentDeSerImpl.name+" | Type : "+parentDeSerImpl.type);


	}
	
}
