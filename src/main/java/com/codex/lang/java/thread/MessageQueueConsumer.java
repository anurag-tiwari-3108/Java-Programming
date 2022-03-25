package com.codex.lang.java.thread;

import java.util.concurrent.BlockingQueue;

public class MessageQueueConsumer implements Runnable {
	private BlockingQueue<MessageQueue> queue;

	public MessageQueueConsumer(BlockingQueue<MessageQueue> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			MessageQueue msg = null;
			while ((msg = queue.take()).getMsg() != "exit") {
				System.out.println(Thread.currentThread().getName()+" Consumed " + msg.getMsg());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
