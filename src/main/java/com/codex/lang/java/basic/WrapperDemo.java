package com.codex.lang.java.basic;

public class WrapperDemo {

	public static void main(String[] args) {
		testint();
		testInteger();
	}

	private static void testint() {
		int i1 = 10;
		int i2 = 10;

		if (i1 == i2) {
			System.out.println("i1==i2 is true for Int");
		}

		// compilation error as we can not assign i2 to i1
		// cannot convert boolean to int
		// if(i1 = i2){
		// System.out.println("i1==i2 is true");
		// }
	}

	private static void testInteger() {
		Integer i1 = 10;
		Integer i2 = 10;

		if (i1 == i2) {
			System.out.println("i1==i2 is true for Integer");
		}

		/*
		 * compilation error as we can not assign i2 to i1 with boolean written
		 * cannot convert boolean to int
		 * in if if(i1 = i2){ System.out.println("i1==i2 is true"); }
		 */
	}

}
