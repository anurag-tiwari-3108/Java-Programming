package com.codex.lang.java.thread;

public class SequentialOddEvenGeneric extends Thread {
	static int number = 1;
	static Object lock = new Object();
	int MAX_COUNT = 10;
	int reminder;

	public SequentialOddEvenGeneric(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number < MAX_COUNT) {
			synchronized (lock) {
				if (number % 2 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(getName() + " " + number);
				number++;
				lock.notify();
			}

		}
	}

}
