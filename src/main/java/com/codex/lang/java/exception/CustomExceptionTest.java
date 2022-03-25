package com.codex.lang.java.exception;

public class CustomExceptionTest {

	public static void main(String[] args) throws ConfigNotFoundException {
		int sum = 10;
		sum = sum + 1;
		System.out.println("Testing the custom eception for the value of sum " + sum);
	}
}
