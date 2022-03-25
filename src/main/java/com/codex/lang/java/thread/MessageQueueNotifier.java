package com.codex.lang.java.thread;

public class MessageQueueNotifier implements Runnable {
	MessageQueue msg;

	public MessageQueueNotifier(MessageQueue msg) {
		this.msg = msg;
	}

	public void run() {
		synchronized (msg) {
			try {				
				Thread.sleep(1000);
				System.out.println("Ok !!! Will Notify");
				msg.notify();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}