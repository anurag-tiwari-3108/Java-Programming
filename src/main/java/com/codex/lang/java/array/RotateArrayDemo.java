package com.codex.lang.java.array;

import java.util.Scanner;

/**
 * Rotate array from N Elements Position.
 * 
 * 
 * @author ANRTIWARI
 *
 */
public class RotateArrayDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}

	private static int[] leftRotation(int[] arr, int length) {
		for (int i = 0; i < 2; i++) {
			leftRotatebyOne(arr, length);
		}
		return arr;
	}

	private static void leftRotatebyOne(int[] arr, int length) {
		System.out.println("Length "+length);
		int i, temp;
		temp = arr[0];
		for (i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
		System.out.println("ANURAG :: "+arr[i]);
	}

}