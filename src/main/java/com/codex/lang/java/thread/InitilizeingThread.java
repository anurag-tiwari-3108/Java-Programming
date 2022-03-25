package com.codex.lang.java.thread;

public class InitilizeingThread implements Runnable {

	@Override
	public void run() {

	}

	public static void main(String[] args) {
		Thread aThread = new Thread();
		Thread bThread = new Thread();
		aThread.start();
		System.out.println("Name of thread : " + aThread.getName());
		System.out.println("Running the thread : ");
		for (int i = 0; i <= 10; i++) {
			aThread.run();
			if (aThread != bThread) {
				System.out.println("Thread :: " + aThread.getName() + "  :: "
						+ bThread.getName());
			}
		}
	}

}
