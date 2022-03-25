package com.codex.lang.java.thread;

public class JoinMethodRawCode implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Current Thread :: "+Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
