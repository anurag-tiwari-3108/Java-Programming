package com.codex.lang.java.thread;


public class SequentialPrintingWithNThread extends Thread {
	public int MAX_COUNT = 9;
	int remainder;
	public static Object obj = new Object();
	public static int number = 1;
	public static int thread_count = 0;

	public SequentialPrintingWithNThread(int reminder) {
		this.remainder = reminder;
	}

	@Override
	public synchronized void start() {
		thread_count++;
		super.start();
	}

	@Override
	public void run() {
		while (number < MAX_COUNT - 1) {
			synchronized (obj) {
				if (number % thread_count != this.remainder) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				obj.notify();
			}
		}

	}
}