package com.codex.lang.java.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreThreadImpl {
	public static void main(String args[]) throws InterruptedException {
		// creating a Semaphore object
		// with number of permits 3 and fairness true
		Semaphore sem = new Semaphore(3, true);

		// isFair() method
		System.out.println("is Fairness enabled : " + sem.isFair());

		// Main thread try to acquire 2 permits
		// tryAcquire(int permits) method
		sem.tryAcquire(2);

		// availablePermits() method
		System.out.println("Available permits : " + sem.availablePermits());

		// drainPermits() method
		System.out.println("number of permits drain by Main thread : " + sem.drainPermits());

		// permit released by Main thread
		sem.release(1);

		// creating two threads with name A and B
		SemaphoreThread mt1 = new SemaphoreThread(sem, "A");
		SemaphoreThread mt2 = new SemaphoreThread(sem, "B");

		// starting threads A
		mt1.start();

		// starting threads B
		mt2.start();

		// toString method
		System.out.println(sem.toString());

		// waiting for threads A and B
		mt1.join();
		mt2.join();
	}
}