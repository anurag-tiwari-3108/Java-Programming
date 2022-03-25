package com.codex.lang.java.basic;

import java.util.HashSet;
import java.util.Set;

public class StaticInterfaceImpl {

	public static void main(String[] args) {

	}

	static int[] oddNumbers(int l, int r) {
		Set aSet = new HashSet();
		int[] arr = null;
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				aSet.add(i);
			}
		}
		return arr;
	}
}