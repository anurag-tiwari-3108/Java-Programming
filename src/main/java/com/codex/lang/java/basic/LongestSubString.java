package com.codex.lang.java.basic; 

/**
 * 
 * Longest substring without repeating the charactor.
 * @author Anurag
 *
 */

public class LongestSubString {
	
	private static int longestSubstring(String inputString){
		
		
		char[] arr = inputString.toCharArray();
		boolean[] flag = new boolean[256];
		int result = 0;
		int start = 0;
		
//		System.out.println("Charactor array : " + arr);
		
		for(int i = 0; i<= inputString.length(); i++){
			char current = arr[i];
			if(flag[current]){
				result = Math.max(result, i - start);
				// the loop update the new start point
				// and reset flag array
				// for example, abccab, when it comes to 2nd c,
				// it update start from 0 to 3, reset flag for a,b
				
				for(int k=start ;k<=i;k++){
					if (arr[k] == current) {
						start = k + 1; 
						break;
					}
					flag[arr[k]] = false;
					
				}
			}else {
				flag[current] = true;
			}
		}
		result = Math.max(arr.length - start, result);
		return result;
	
	}
	
	
	public static void main(String [] args){

		System.out.println("output : "+longestSubstring("anuragtiwari"));		
	
	}
	
	
}
