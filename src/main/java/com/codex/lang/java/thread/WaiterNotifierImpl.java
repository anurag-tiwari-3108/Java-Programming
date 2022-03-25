package com.codex.lang.java.thread;

public class WaiterNotifierImpl {

	public static void main(String[] args) {
		Message msg = new Message("Process IT");
		Waiter wait = new Waiter(msg);
		Notifier notify = new Notifier(msg);
		
		new Thread(wait, "wait").start();
		new Thread(notify, "notify").start();

	}
}
