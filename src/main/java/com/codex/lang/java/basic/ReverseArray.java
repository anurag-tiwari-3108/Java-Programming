package com.codex.lang.java.basic;

public class ReverseArray {
	public static void main(String [] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i <= ar.length/2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = temp;

		}
		
		System.out.println("The output array is ");
		for(int i=0; i<= 6; i++){
			System.out.println(ar[i]);
		}
	}

}
