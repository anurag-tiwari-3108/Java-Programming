package com.codex.lang.java.exception;

public class MultiCatch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		try {
			for (int counter : arr) {
				System.out.println("Current Counter " + counter);
			}
		} catch (ArithmeticException ae) {

		} catch (NullPointerException ne) {

		} catch (Exception ex) {

		}
	}

}
