package com.codex.lang.java.array;

public class RotateArrayDemo1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int indexForBreak = 2;
		leftRotate(arr, indexForBreak, arr.length);
		ArrayUtil.printArray(arr);
	}
	static void leftRotate(int arr[], int indexForBreak, int length) {
		for (int i = 0; i < indexForBreak; i++) {
			leftRotatebyOneUsingLoop(arr, length);
		}

	}
	// Left Shifting of elements
	static void leftRotatebyOneUsingLoop(int arr[], int length) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}
}
