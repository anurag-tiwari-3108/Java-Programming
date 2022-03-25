package com.codex.lang.java.array;

public class ReverseAfterNElements {
	
	public static void main(String [] args){
		int[] arr = {1,2,3,4,5,6,7,8};
		int start = 2;
		int end = 5;
		reverse(arr, start, end);
		ArrayUtil.printArray(arr);
		
	}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while(start < end){
			temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start++;
			end --;
		}		
	}
}
