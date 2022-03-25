package com.codex.lang.java.basic;

public class Polymorphism {
	
	
	public static int methodA(int i){
		System.out.println("Checking....");
		return i;
	}
	
	public static int methodA(Integer i){
		System.out.println("Not Checking....");
		return i;
	}
	
	
	public static void main(String [] args){
		
		methodA(1);
	}
}
