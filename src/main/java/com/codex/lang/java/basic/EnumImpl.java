package com.codex.lang.java.basic;

public class EnumImpl {

	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i <= 3) {
				System.out.println(Level.LOW);
			} else if (i > 3 && i < 7) {
				System.out.println(Level.MEDIUM);
			} else {
				System.out.println(Level.HIGH);
			}

		}

	}
}
