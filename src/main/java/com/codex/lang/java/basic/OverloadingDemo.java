package com.codex.lang.java.basic;

public class OverloadingDemo {

	
	public static void main(String[] args) {
		processCalculation(1,2,3);
		processCalculation(1,2);
		processCalculation(1,2,4);
	}

	private static void processCalculation(int i, int j) {
		System.out.println(1);		
	}

	private static double processCalculation(int i, int j, int k) {
		System.out.println(2);
		return 0;
	}
	
	private static String processCalculation(int i, int j, String k) {
		System.out.println(2);
		
		return null;
				
	}

}
