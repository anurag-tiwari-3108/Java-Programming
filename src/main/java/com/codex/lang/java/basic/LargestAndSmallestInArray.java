package com.codex.lang.java.basic;

import java.util.Arrays;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,4,5,6,7,7,8,5,7,8,4,2,10,4,55,11,0, 110};		
		solution(ar);
	}

	private static void solution(int[] ar) {
		System.out.println("Solution one to find the smallest and largest no in array of "+ar.toString());
		Arrays.sort(ar);
		System.out.println("| Smallest would be :"+ar[0]+" | Largest would be "+ar[ar.length-1]+" |");
	}		
}
