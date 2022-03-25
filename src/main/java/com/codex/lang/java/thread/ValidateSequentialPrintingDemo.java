package com.codex.lang.java.thread;

public class ValidateSequentialPrintingDemo {
	public static void main(String[] args) {
		ValidateSequentialPrinting T1 = new ValidateSequentialPrinting(1);
		ValidateSequentialPrinting T2 = new ValidateSequentialPrinting(0);

		new Thread(T1, "Thread-T1 :: ").start();
		new Thread(T2, "Thread-T2 :: ").start();
	}
}
