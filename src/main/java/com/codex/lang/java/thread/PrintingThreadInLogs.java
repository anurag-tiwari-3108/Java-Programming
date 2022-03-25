package com.codex.lang.java.thread;

public class PrintingThreadInLogs implements Runnable{
	
	int numberOfThread;

	public PrintingThreadInLogs(int Number) {
		this.numberOfThread = Number;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread()
					.getName(), numberOfThread, i, i * numberOfThread);
		}
	}


}
