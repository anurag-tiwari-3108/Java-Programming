package com.codex.lang.java.basic;


public class GenericReturnMethod <E extends Number>{
	
	
	public static void main(String[] args) {
		
		System.out.println("Outcome is "+outcome(1,2));
		System.out.println("Outcome is "+outcome(1.2,2.2));
		System.out.println("Outcome is "+outcome(1,2));
			
				
	}

	private static Number outcome(Number i, Number j) {
		Number k = 10.12;
		return k;
	}

}
