package com.codex.lang.java.thread;

public class DaemonThread extends Thread {

	public DaemonThread() {
		setDaemon(true);
	}

	public void run() {
		System.out.println("Is this thread Daemon? - " + isDaemon());
	}

	public static void main(String a[]) {
		DaemonThread dt = new DaemonThread();
		dt.start();
	}
}
