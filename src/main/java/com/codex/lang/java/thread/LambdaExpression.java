package com.codex.lang.java.thread;

import java.util.stream.IntStream;

public class LambdaExpression {
	/** 
	 * Practices Class To Use Lambda Expression
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		System.out.println("");
		Runnable r1 = () -> System.out.println("Into the runable interface");
	}
	
	public static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2,number).noneMatch(index -> number % index ==0);
	}

}
