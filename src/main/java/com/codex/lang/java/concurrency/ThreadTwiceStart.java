package com.codex.lang.java.concurrency;

public class ThreadTwiceStart implements Runnable {
	public static void main(String[] args) {
			
		// creating a thread
		Thread t = new Thread(new ThreadTwiceStart(), "MyThread");
		t.start();
		t = new Thread(new ThreadTwiceStart(), "MyThread");
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread started running "
				+ Thread.currentThread().getName());
	}
}