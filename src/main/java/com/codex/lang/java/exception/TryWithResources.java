package com.codex.lang.java.exception;

import java.io.FileOutputStream;

/**
 * In Java, the try-with-resources statement is a try statement that declares
 * one or more resources. The resource is as an object that must be closed after
 * finishing the program. The try-with-resources statement ensures that each
 * resource is closed at the end of the statement execution.
 * 
 * You can pass any object that implements java.lang.AutoCloseable, which
 * includes all objects which implement java.io.Closeable.
 * 
 * The following example writes a string into a file. It uses an instance of
 * FileOutputStream to write data into the file. FileOutputStream is a resource
 * that must be closed after the program is finished with it. So, in this
 * example, closing of resource is done by itself try.
 * 
 * @author anutiwar
 *
 */
public class TryWithResources {
	public static void main(String[] args) {
		TryWithResourceWithFinally();
		TryWithResourceBasic();
	}

	private static void TryWithResourceBasic() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/java7-new-features/src/abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

	private static void TryWithResourceWithFinally() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/home/irfan/scala-workspace/java7-new-features/src/abc.txt")) {
			// -----------------------------Code to write data into file--------------------------------------------//
			String msg = "Welcome to java TryWithResourceWithFinally!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("Data written successfully!");
		} catch (Exception exception) {
			System.out.println(exception);
		} finally {
			System.out.println("Finally executes after closing of declared resources.");
		}		
	}

}
