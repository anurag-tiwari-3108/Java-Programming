package com.codex.lang.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaCombinations {
	
	public static void main(String [] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().forEach(System.out::println);		
		list.stream().filter(n-> n%2==0);
		
	}
}
