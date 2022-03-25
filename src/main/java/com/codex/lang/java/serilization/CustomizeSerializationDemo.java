package com.codex.lang.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.codex.*;

/**
 * Customized serialization require for the params which we wanted to serialized but do not wanted them to disclose to everyone
 * like password of user which we can't trainsient and also can't just serialized like any other Params. So for these type types
 * of params we use customized serialization 
 * We can implements customized serialization by two call back method.
 * <html>i.e private void writeObject (Object oos) throws exception</html>
 * <html>i.e private void readObject (Object oos) throws exception</html>
 *  
 * Call back methods are those methods which are called by JVM automatically like above method. The above methods syntax should be like above
 * because JVM only understand above syntax only.
 * 
 * The method will be applied in those classess which implements the interface serializable;
 * 
 * @author ANRTIWARI
 *
 */

public class CustomizeSerializationDemo {

	
	public static String FILE = "serialized-object.ser" ;
	public static void main(String ... args) throws IOException, ClassNotFoundException{
		CustomizeSerialization customizeSerial = new CustomizeSerialization();
		System.out.println("Username : "+customizeSerial.username+" | Password : "+customizeSerial.password);

		FileOutputStream fos = new FileOutputStream(Constants.IO.PATH+FILE);
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(customizeSerial);
		oos.close();
		
		FileInputStream fis  = new FileInputStream(Constants.IO.PATH+FILE);
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomizeSerialization customizeDeSerial = (CustomizeSerialization)ois.readObject();
		System.out.println("Username : "+customizeDeSerial.username+" | Password : "+customizeDeSerial.password);
		ois.close();

	}
	
}
