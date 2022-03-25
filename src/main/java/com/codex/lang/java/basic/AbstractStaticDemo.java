package com.codex.lang.java.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class AbstractStaticDemo {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new LinkedHashMap<Integer, String>();

		for (int i = 1; i < 1000; i++) {
			hmap.put(i, "R" + i);
		}
		for (Map.Entry h : hmap.entrySet()) {
			System.out.println(h.getKey());
		}
	}

}
