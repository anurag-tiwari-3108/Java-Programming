package com.codex.lang.java.array;

public class ReverseString {

	public static void main(String[] args) {
		
		String testString = "The name is anurag tiwari";
		char[] charArray = testString.toCharArray();
		for(int i=0; i<=charArray.length/2; i++){
			
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length -i -1];
			charArray[charArray.length -i -1] = temp;
			System.out.println("Output :: ");
		}
		for(int j =0; j<= charArray.length-1;j++){
			System.out.print("|"+charArray[j]);
		}

	}
}
