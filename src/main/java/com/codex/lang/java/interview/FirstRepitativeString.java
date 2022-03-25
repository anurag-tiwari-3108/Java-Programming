package com.codex.lang.java.interview;

import java.util.LinkedList;
import java.util.List;

public class FirstRepitativeString {

	public static void main(String [] args){
		
		String [] arrayOfString = new String[6];
		arrayOfString[0] = "Anurag";
		arrayOfString[1] = "Tiwari";
		arrayOfString[2] = "Tiwari";
		arrayOfString[3] = "Delhi";
		arrayOfString[4] = "New york";
		arrayOfString[5] = "New york";
		System.out.println(getFirstNonRepitative(arrayOfString));				
	}

	private static String getFirstNonRepitative(String[] args) {		
		String output = new String ("There is no repitative argument in the input");
		List<String> aList =  new LinkedList<String>();
		String index = "N/A";
		for(int i =0; i < args.length; i++){
			if(!aList.contains(args[i])){
				aList.add(args[i]);
			}
			else {
				output = args[i];
				index = i+"";
				break;
			}
		}		
		
		System.out.println("Returning the String "+output+" and index "+index);
		return output;
	}
}
