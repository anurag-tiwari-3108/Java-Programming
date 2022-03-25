package com.codex.lang.java.basic;

public class StringEqualsCheck {
	
	public static void main(String[] args){
	
		String a="abc";
		String b="abc";
		
		String c=new String("abc");
		String d=new String("abc");
		
		if(a==b){
			System.out.println("a==b True");
		
		}
		
		if(c==d){
			System.out.println("c==d True");
		}
		
		if(a.equals(b))
		{
			System.out.println("a.equals(b) true");
		}
		
		if(c.equals(d))
		{
			System.out.println("c.equals(d) true");
		}

	}

}
