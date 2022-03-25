package com.codex.lang.java.thread;

public class JoinMethodImpl {
/**
 * hault the processing of current executing thread and start processing the new thread which is joining
 * @param args
 */
	public static void main(String[] args) {
		Thread th1 = new Thread(new JoinMethodRawCode(), "TH1");
//		Thread th2 = new Thread(new JoinMethodRawCode(), "TH2");
//		Thread th3 = new Thread(new JoinMethodRawCode(), "TH3");
		System.out.println("Starting Processing :: " + Thread.currentThread().getName());
		th1.start();
//		th2.start();
//		th3.start();
		System.out.println("Current Thread :: "+Thread.currentThread().getName());
		try {
			th1.join();
//			th2.join();
//			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Thread :: "+Thread.currentThread().getName());
		System.out.println("Finished Processing Thread");
	}
}
