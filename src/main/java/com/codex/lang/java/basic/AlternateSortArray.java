package com.codex.lang.java.basic;

import java.util.Arrays;

public class AlternateSortArray {
	public static void findAltSort(int[] arr)
	  {
	     int n=arr.length/2;
	        for (int i=1;i<n;i++){
	            for (int j=-i;j<i;j+=2){
	                swap(arr,n+j,n+j+1);

	            }
	        }
	  }
	   private static void swap(int[] arr, int index1, int index2){
	        int temp=arr[index1];
	        arr[index1]=arr[index2];
	        arr[index2]=temp;
	    }
	    
	 public static void main(String[] args){
	        int[] arr = {1,2,3,'a','b','c'};
	        System.out.println("before sorting "+Arrays.toString(arr));
	        findAltSort(arr);
	        System.out.println("After sorting "+ Arrays.toString(arr));
	    }


}
