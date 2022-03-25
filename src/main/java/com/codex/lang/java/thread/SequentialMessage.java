package com.codex.lang.java.thread;

public class SequentialMessage {
	volatile static Object monitor = new Object();
	volatile static boolean one = true;
	volatile static boolean two = false;
	volatile static int count = 1;

	public static void main(String[] args) {
		Thread th1 = new Thread(new SequentialPrinting(1));
		Thread th2 = new Thread(new SequentialPrinting(2));

		th1.start();
		th2.start();

	}

	static class SequentialPrinting implements Runnable {
		int threadId;

		public SequentialPrinting(int threadId) {
			this.threadId = threadId;
		}

		@Override
		public void run() {
			try {
				printMessage();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		private void printMessage() throws InterruptedException {
			while(true){
			synchronized (monitor) {
				if (1 == threadId) {
					if (!one) {
						monitor.wait();
					} else {
						System.out.print("Thread-1 ");
						System.out.println("Hello");

						one = false;
						two = true;
						monitor.notifyAll();
					}
				}
				if (2 == threadId) {
					if (!two) {
						monitor.wait();
					} else {
						System.out.print("Thread-2 ");
						System.out.println("Anurag");
						one = true;
						two = false;
						monitor.notifyAll();
					}
				}
			}}
		}
	}

}