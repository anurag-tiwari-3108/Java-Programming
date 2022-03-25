package com.codex.lang.java.thread;


public class SequentialPrintingWithNThreadImpl {
	public static void main(String[] args) {

		SequentialPrintingWithNThread t1 = new SequentialPrintingWithNThread(1);
		SequentialPrintingWithNThread t2 = new SequentialPrintingWithNThread(2);
		SequentialPrintingWithNThread t3 = new SequentialPrintingWithNThread(0);
		
		t1.setName("Thread-1 :: ");
		t2.setName("Thread-2 :: ");
		t3.setName("Thread-3 :: ");
		
		t1.start();
		t2.start();
		t3.start();

//		 SequentialPrintingWithNThread t1 = new SequentialPrintingWithNThread(1);
//		 SequentialPrintingWithNThread t2 = new SequentialPrintingWithNThread(0);
//		 t1.setName("Thread-1 :: ");
//		 t2.setName("Thread-2 :: ");
//		 t1.start();
//		 t2.start();
	}
}