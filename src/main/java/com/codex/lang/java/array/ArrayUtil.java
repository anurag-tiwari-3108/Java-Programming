package com.codex.lang.java.array;


public class ArrayUtil {

	public static void printArray(int [] arr){
		for ( int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	@SuppressWarnings("unused")
	private static void reverseArrayRecursive(int[] arr, int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayRecursive(arr, start + 1, end - 1);
	}

}
