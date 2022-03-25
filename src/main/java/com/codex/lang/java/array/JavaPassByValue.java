package com.codex.lang.java.array;

/**
 * https://www.netjstech.com/2015/04/java-pass-by-value-or-pass-by-reference.html
 */
import java.util.ArrayList;
import java.util.List;

public class JavaPassByValue {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		modifyList(list);	
	}

	private static void modifyList(List<String> list) {		
		list.add("d");
		System.out.println(list);		
		list = null;
		System.out.println(list);		
	}
}
