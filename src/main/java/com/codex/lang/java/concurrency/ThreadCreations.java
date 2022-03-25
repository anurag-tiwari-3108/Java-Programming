package com.codex.lang.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class ThreadCreations extends Thread {
	BlockingQueue<String> aqueue;
	private String cName = "org.java.app.Threading.MultithreadingDemoProducer :: ";

	public ThreadCreations(BlockingQueue queue) {
		this.aqueue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(cName + " PRODUCER " + aqueue.size());
				aqueue.put("Thread_" + Thread.currentThread().getId());
			}
			System.out.println(cName+"Size of thread "+aqueue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}
}