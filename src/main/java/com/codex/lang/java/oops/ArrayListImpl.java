package com.codex.lang.java.oops;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String [] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(null);
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
			
		}
	}
}
