package com.codex.lang.java.thread;

public class ValidateSequentialPrinting implements Runnable {
	static int COUNTER = 0;
	static Object LOCK = new Object();
	int MAX_COUNT = 10;
	int reminder;

	public ValidateSequentialPrinting(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while(COUNTER < MAX_COUNT) {
			synchronized (LOCK) {
				if(COUNTER %2 == reminder) {
					try {
						LOCK.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + COUNTER);
				COUNTER++;
				LOCK.notify();				
			}
		}
		
	}
}