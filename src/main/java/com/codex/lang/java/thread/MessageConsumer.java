package com.codex.lang.java.thread;

import java.util.concurrent.BlockingQueue;

public class MessageConsumer implements Runnable {
	private BlockingQueue<Message> queue;

	public MessageConsumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			Message msg = null;
			while ((msg = queue.take()).getMsg() != "exit") {
				System.out.println(Thread.currentThread().getName()+" Consumed " + msg.getMsg());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
