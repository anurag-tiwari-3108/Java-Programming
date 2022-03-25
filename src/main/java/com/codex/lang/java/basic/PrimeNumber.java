package com.codex.lang.java.basic;

/**
 * @author Anurag
 * Prime number : A prime number is a whole number greater than 1, 
 * whose only two whole-number factors are 1 and itself. 
 * The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Starting the program :");
		int num = 10;

		int count = 0;

		for (int i = 1; i <= num; i++) {
			System.out.println("First for loop "+i);

			count = 0;

			for (int j = 2; j <= i / 2; j++) {
				System.out.println("Child for loop "+j);

				if (i % j == 0) {
					System.out.println("If Condition");

					count++;
					break;
				}

			}

			if (count == 0) {

				System.out.println("\n "+i+"\n ");

			}

		}
	}
}