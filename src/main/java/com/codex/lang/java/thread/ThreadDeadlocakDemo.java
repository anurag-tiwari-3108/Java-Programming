package com.codex.lang.java.thread;

public class ThreadDeadlocakDemo {
	private final String name;

	public ThreadDeadlocakDemo(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public synchronized void call(ThreadDeadlocakDemo caller) {
		System.out.println(this.getName() + " has asked to call me " + caller.getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Calling another synchronized method
		caller.callMe(this);
	}

	public synchronized void callMe(ThreadDeadlocakDemo caller) {
		System.out.println(this.getName() + " has called me " + caller.getName());
	}

	public static void main(String[] args) {
		ThreadDeadlocakDemo caller_1 = new ThreadDeadlocakDemo("Caller-1");
		ThreadDeadlocakDemo caller_2 = new ThreadDeadlocakDemo("Caller-2");

		new Thread(new Runnable() {
			public void run() {
				caller_1.call(caller_2);
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				caller_2.call(caller_1);
			}
		}).start();
	}
}
