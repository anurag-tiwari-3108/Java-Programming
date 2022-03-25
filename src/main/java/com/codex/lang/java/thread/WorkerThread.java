package com.codex.lang.java.thread;

public class WorkerThread implements Runnable {
	String command = "";

	public WorkerThread(String command) {
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
			Thread.currentThread().sleep(100);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
