package com.codex.lang.java.thread;

public class WaitNotifyListPCImpl {

	public static void main(String[] args) throws InterruptedException {
		final WaitNotifyListPC pc = new WaitNotifyListPC();
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		System.out.println(WaitNotifyListPCImpl.class.getName() + " :: Starting");
		th1.start();
		th2.start();

		th2.join();
		th1.join();
		System.out.println(WaitNotifyListPCImpl.class.getName() + " :: Finished");
	}
}
