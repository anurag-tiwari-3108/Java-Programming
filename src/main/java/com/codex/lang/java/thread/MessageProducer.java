package com.codex.lang.java.thread;

import java.util.concurrent.BlockingQueue;

public class MessageProducer implements Runnable{

	BlockingQueue<Message> queue;

	public MessageProducer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Message msg = new Message(" " + i);
			try {
				queue.put(msg);
				System.out.println(Thread.currentThread().getName()+" Produced " + msg.getMsg());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}
}
