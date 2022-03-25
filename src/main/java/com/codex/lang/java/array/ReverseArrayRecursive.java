package com.codex.lang.java.array;

public class ReverseArrayRecursive {

	@SuppressWarnings("unused")
	public static void main(String... args) {
		int[] param = { 1, 2, 3, 4, 5, 6, 7 };
//		reverseArrayString(param,0,6);		
//		ArrayUtil.printArray(param);
		System.out.println("Reversed String is "+reverseStringRecursive("Anurag"));
	}

	@SuppressWarnings("unused")
	private static void reverseArrayString(int[] arr, int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayString(arr, start + 1, end - 1);
	}
	
	
	private static String reverseStringRecursive(String param){
		if (param.isEmpty())
            return param;		
		System.out.println("SubString method "+param.substring(1)+" CharAt Method "+param.charAt(0));
		System.out.println("Remaining String is "+param);
		return reverseStringRecursive(param.substring(1)) + param.charAt(0);		
	}

}
