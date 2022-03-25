package com.codex.lang.java.thread;

public class MessageQueueWaiter implements Runnable {
	MessageQueue msg;

	public MessageQueueWaiter(MessageQueue msg) {
		this.msg = msg;
	}

	public void run() {
		synchronized (msg) {
			try {
				System.out.println("Waiting to get notify");
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
