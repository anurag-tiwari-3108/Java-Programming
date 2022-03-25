package com.codex.lang.java.basic;

/**
 * Ideally for this we have to use Manacher algo. In computer science, the longest
 * palindromic substring or longest symmetric factor problem is the problem of 
 * finding a maximum-length contiguous substring of a given string that is also 
 * a palindrome. For example, the longest palindromic substring of "bananas" is 
 * "anana". The longest palindromic substring is not guaranteed to be unique; 
 * for example, in the string "abracadabra", there is no palindromic substring 
 * with length greater than three, but there are two palindromic substrings with 
 * length three, namely, "aca" and "ada". In some applications it may be necessary 
 * to return all maximal palindromic substrings (that is, all substrings that are 
 * themselves palindromes and cannot be extended to larger palindromic substrings) 
 * rather than returning only one substring or returning the maximum length of a 
 * palindromic substring.
 * 
 * But here we are using some different methods.
 * @author Anurag
 *
 */
public class LongestPalimdrom {

	
	public static String getLongestPalindrome(final String input) {
		int rightIndex = 0, leftIndex = 0;
		String currentPalindrome = "", longestPalindrome = "";
		for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
			leftIndex = centerIndex - 1;
			rightIndex = centerIndex + 1;
			while (leftIndex >= 0 && rightIndex < input.length()) {
				if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
					break;
				}
				currentPalindrome = input.substring(leftIndex, rightIndex + 1);
				longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
				leftIndex--;
				rightIndex++;
			}
		}
		return longestPalindrome;
	}
	
	public static void main(String [] args){
		String inputString="abcababandjakfdfghjklerghjkghn";
		System.out.println("Longest Palimdrome in the String "+inputString+" is "+getLongestPalindrome(inputString));
		
	}

}