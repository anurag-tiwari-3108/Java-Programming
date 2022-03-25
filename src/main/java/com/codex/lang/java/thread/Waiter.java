package com.codex.lang.java.thread;

public class Waiter implements Runnable {
	Message msg;

	public Waiter(Message msg) {
		this.msg = msg;
	}

	public void run() {
		synchronized (msg) {
			try {
				System.out.println("Waiting to get notify");
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
