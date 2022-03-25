package com.codex.lang.java.executor;

public class ThreadPoolWorker implements Runnable {
	String command = "";

	public ThreadPoolWorker(String command) {
		this.command = command;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start.Command " + command);
		processCommands();
		System.out.println(Thread.currentThread().getName() + " End.Command " + command);

	}

	public void processCommands() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
