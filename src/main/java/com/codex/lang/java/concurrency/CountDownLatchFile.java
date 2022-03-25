package com.codex.lang.java.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchFile implements Runnable {
	private String threadName;
	CountDownLatch cd;

	CountDownLatchFile(String threadName, CountDownLatch cd) {
		this.cd = cd;
		this.threadName = threadName;
	}

	public void run() {
		System.out.println("Latching down the counter");
		cd.countDown();
	}
}
