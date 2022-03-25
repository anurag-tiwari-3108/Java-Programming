package com.codex.lang.java.pattern;

import java.util.Scanner;

/**
 *1
 *12
 *123
 *1234
 *12345 
 */
public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Enter the no of line you want to print : ");
		Scanner in = new Scanner(System.in);
		int lenght = in.nextInt();
		for (int i = 1; i <= lenght; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
