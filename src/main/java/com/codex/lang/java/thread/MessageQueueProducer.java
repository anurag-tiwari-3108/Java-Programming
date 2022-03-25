package com.codex.lang.java.thread;

import java.util.concurrent.BlockingQueue;

public class MessageQueueProducer implements Runnable{

	BlockingQueue<MessageQueue> queue;

	public MessageQueueProducer(BlockingQueue<MessageQueue> queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 1; i < 10; i++) {
			MessageQueue msg = new MessageQueue(" " + i);
			try {
				queue.put(msg);
				System.out.println(Thread.currentThread().getName()+" Produced " + msg.getMsg());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}
}
