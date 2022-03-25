package com.codex.lang.java.basic;

/**
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 
 * @author ANRTIWARI
 *
 */
public class Pattern {

	public static void main(String[] args) throws InterruptedException {

		int x = 11;
		int y = x / 2; // spaces
		int z = 1; // *`s

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(" ");
				Thread.currentThread().sleep(800);
				System.out.print(" ");

			}
			for (int k = 0; k < z; k++) {
				System.out.print("*");
				Thread.currentThread().sleep(800);
				System.out.print("2");
			}

			y = y - 1;
			z = z + 2;
			System.out.println();
		}
	}
}