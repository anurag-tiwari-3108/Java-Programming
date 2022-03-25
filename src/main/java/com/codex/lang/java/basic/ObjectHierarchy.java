package com.codex.lang.java.basic;

/**
 * Variable Hierarchy 
 * OBJECT
 * 	-- String/int/long
 *  -- Wrapper Classess Integer/Long etc
 * @author ANRTIWARI
 *
 */
public class ObjectHierarchy {

	public static void main(String [] args){
		processMethod("");
		processMethod("Anurag");
		processMethod(10);
		processMethod(10.2);
	}

	private static void processMethod(String value) {
		System.out.println(" 1 ");
	}
	private static void processMethod(Integer value) {
		System.out.println(" 2 ");
	}

	private static void processMethod(int value) {
		System.out.println(" 3 ");
	}

	private static void processMethod(Long value) {
		System.out.println(" 4 ");
	}
	private static void processMethod(long value) {
		System.out.println(" 5 ");
	}
	private static void processMethod(double value) {
		System.out.println(" 6 ");
	}
	private static void processMethod(Double value) {
		System.out.println(" 7 ");
	}

}
