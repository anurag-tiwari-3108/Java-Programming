package com.codex.lang.java.thread;

public class RunThread implements Runnable {

	private int numberOfThread;

	public RunThread(int number) {
		this.numberOfThread = number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread()
					.getName(), numberOfThread, i, i * numberOfThread);
		}

	}

	public static void main(String[] args) {
		System.out.println("Wow... Running the thread");
		for (int i = 1; i <= 10; i++) {
			RunThread anObject = new RunThread(i);
			Thread thread = new Thread(anObject);
			thread.start();
		}
	}
}
