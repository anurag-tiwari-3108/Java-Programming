package com.codex.lang.java.thread;

public class WaitNotifyListPC {

	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer Thread Waiting...!!!");
			wait();
		}
	}

	public void consume() throws InterruptedException {

		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Consumer Thread Notifying...!!!");
			notify();
		}
	}
}
