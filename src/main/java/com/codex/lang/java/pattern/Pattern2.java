package com.codex.lang.java.pattern;

import java.util.Scanner;
/**
 * 	   *
 * 	  ***
 *   *****
 *  *******
 */
public class Pattern2 {
	
	public static void main(String[] args) {
		System.out.println("Enter the no of line you want to print : ");
		Scanner in = new Scanner(System.in);
		int lenght = in.nextInt();

		for (int i = 1; i <= lenght; i++) {
			for (int j = 0; j < (lenght - i); j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			for (int j = 1; j < i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		
	}
}