package com.codex.lang.java.array;

/**
 * Restrict the end used to use my class and he/she can only create a limited
 * object of this class. This is also an application of Static Factory design
 * pattern.
 * 
 */
public class RestrictObjectCreation {

	private static int count;
	private static int MAX_COUNT = 3;

	private RestrictObjectCreation() {
	}

	public static RestrictObjectCreation getInstance() {
		if (count < MAX_COUNT) {
			count++;
			System.out.println("Going to return the object");
			return new RestrictObjectCreation();
		}
		return null;
	}
}
