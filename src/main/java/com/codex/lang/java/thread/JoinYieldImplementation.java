package com.codex.lang.java.thread;

public class JoinYieldImplementation {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println();
			}
		});

		Thread th1 = new Thread(thread, "Thread-5");
		Thread th2 = new Thread(thread, "Thread-10");
		Thread th3 = new Thread(thread, "Thread-15");
		System.out.println("JoinYieldImplementation: Created All The Threads");
		System.out.println("JoinYieldImplementation: Running Thread : " + Thread.currentThread().getName());

		th1.start();
		th2.start();
		th3.start();

		try {
			// th1.join();
			// th2.join();
			// th3.join();

			Thread.yield(); // Hold the current execution thread and give priority to other thread.
			Thread.yield();
			Thread.yield();

		} catch (Exception x) {
			x.printStackTrace();
		}
		System.out.println("JoinMethodImpl: Finished All The Threads");
	}

}
