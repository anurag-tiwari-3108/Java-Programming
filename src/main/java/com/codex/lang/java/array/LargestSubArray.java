package com.codex.lang.java.array;

import java.util.Scanner;

public class LargestSubArray {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str = input.next();
		int r2 = calculate1(str.toCharArray());
		System.out.print("Largest Sub Array Length : " + r2);
	}

	public static int calculate1(char[] str) {
		int T[][] = new int[str.length][str.length];
		for (int i = 0; i < str.length; i++) {
			T[i][i] = 1;
		}
		for (int l = 2; l <= str.length; l++) {
			for (int i = 0; i < str.length - l + 1; i++) {
				int j = i + l - 1;
				if (l == 2 && str[i] == str[j]) {
					T[i][j] = 2;
				} else if (str[i] == str[j]) {
					T[i][j] = T[i + 1][j - 1] + 2;
				} else {
					T[i][j] = Math.max(T[i + 1][j], T[i][j - 1]);
				}
			}
		}
		return T[0][str.length - 1];
	}
}
