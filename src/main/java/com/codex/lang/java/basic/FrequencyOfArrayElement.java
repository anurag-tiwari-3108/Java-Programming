package com.codex.lang.java.basic;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 2, 1, 1, 1 };
		Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();
		solutionOne(ar, aMap);
	}

	private static void solutionOne(int[] ar, Map<Integer, Integer> aMap) {
		
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println("Updating entry into map ");
			if (aMap.containsKey(ar[i])) {
				aMap.put(ar[i], aMap.get(ar[i] + 1));
			} else {
				aMap.put(ar[i], 1);
			}
		}

		
		System.out.println("Frequency of 1:  " + aMap.keySet());


	}
}
