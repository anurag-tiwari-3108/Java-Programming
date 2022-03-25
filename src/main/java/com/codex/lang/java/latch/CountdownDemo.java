package com.codex.lang.java.latch;

import java.util.concurrent.CountDownLatch;

/**
 * -- TODO Needs to add Information about Countdown Latch
 * @author ANRTIWARI
 *
 */
public class CountdownDemo {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(4);

		System.out.println("CountdownDemo :: Running Countdown application");
		CountdownLatchImpl first = new CountdownLatchImpl(2, latch, "WORKER-1");
		CountdownLatchImpl second = new CountdownLatchImpl(3, latch, "WORKER-2");
		CountdownLatchImpl third = new CountdownLatchImpl(4, latch, "WORKER-3");
		CountdownLatchImpl fourth = new CountdownLatchImpl(5, latch, "WORKER-4");

		first.start();
		second.start();
		third.start();
		fourth.start();
		
		 // The main task waits for four threads
        try {
			latch.await();			

		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
        // Main thread has started
        System.out.println("CountdownDemo :: "+Thread.currentThread().getName() +" has finished");
	}
}
