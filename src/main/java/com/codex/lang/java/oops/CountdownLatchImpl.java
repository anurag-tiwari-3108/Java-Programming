package com.codex.lang.java.oops;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchImpl {

	public static void main(String[] args) {
		CountDownLatch cd = new CountDownLatch(3);
		Thread t1 = new Thread(new CountDownLatchFile("Thread-1", cd));
		Thread t2 = new Thread(new CountDownLatchFile("Thread-2", cd));
		Thread t3 = new Thread(new CountDownLatchFile("Thread-3", cd));
		t1.start();
		t2.start();
		t3.start();
		try {
			System.out.println("Calling await");
			cd.await();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
