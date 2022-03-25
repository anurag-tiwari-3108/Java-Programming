package com.codex.lang.java.thread;

public class Notifier implements Runnable {
	Message msg;

	public Notifier(Message msg) {
		this.msg = msg;
	}

	public void run() {
		synchronized (msg) {
			try {
				Thread.currentThread().sleep(50000);
				System.out.println("Ok !!! Will Notify");
				msg.notify();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}