package com.codex.lang.java.thread;

public class SequentialOddEvenGenericImpl {

	public static void main(String[] args) {
		SequentialOddEvenGeneric t1 = new SequentialOddEvenGeneric(1);
		SequentialOddEvenGeneric t2 = new SequentialOddEvenGeneric(0);

		t1.setName("Thread-1 :: ");
		t2.setName("Thread-2 :: ");

		t1.start();
		t2.start();
	}

}
