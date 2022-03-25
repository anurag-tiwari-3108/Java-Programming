package com.codex.lang.java.thread;

public class MessageQueueWaitNotifyImpl {

	public static void main(String[] args) {
		MessageQueue msg = new MessageQueue("Process IT");
		MessageQueueWaiter wait = new MessageQueueWaiter(msg);
		MessageQueueNotifier notify = new MessageQueueNotifier(msg);
		
		new Thread(wait, "wait").start();
		new Thread(notify, "notify").start();

	}
}
