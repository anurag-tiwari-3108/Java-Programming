package com.codex.lang.java.concurrency;

public class SequentialTablesPrinting {
	static Object moniter = new Object();
	static boolean one = true;
	static boolean two = false;
	static boolean three = false;
	static int count = 1;
	static int indexOfTable2 = 1;
	static int indexOfTable3 = 1;
	static int indexOfTable4 = 1;
	

	public static void main(String[] args) {

		Thread th1 = new Thread(new SequentialTable(1));
		Thread th2 = new Thread(new SequentialTable(2));
		Thread th3 = new Thread(new SequentialTable(3));

		th1.setName("Thread-1");
		th2.setName("Thread-2");
		th3.setName("Thread-3");

		
		th1.start();
		th2.start();
		th3.start();
	}

	static class SequentialTable implements Runnable {
		int threadId;

		public SequentialTable(int threadId) {
			this.threadId = threadId;
		}

		public void run() {
			try {
				print();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		private void print() throws InterruptedException {
			while (indexOfTable4 < 11) {
				synchronized (moniter) {
					if (1 == threadId) {
						if (!one) {
							moniter.wait();
						} else {
							System.out.print(Thread.currentThread().getName()+":: ");
							System.out.print(2*indexOfTable2+"  " );
							one = false;
							two = true;
							three = false;
							indexOfTable2++;
							moniter.notifyAll();
						}
					}
					if (2 == threadId) {
						if (!two) {
							moniter.wait();
						} else {
							System.out.print(Thread.currentThread().getName()+":: ");
							System.out.print(3*indexOfTable3+"  " );
							one = false;
							two = false;
							three = true;
							indexOfTable3++;
							moniter.notifyAll();
						}
					}
					if (3 == threadId) {
						if (!three) {
							moniter.wait();
						} else {
							System.out.print(Thread.currentThread().getName()+":: ");
							System.out.print(4*indexOfTable4);
							one = true;
							two = false;
							three = false;
							indexOfTable4++;
							moniter.notifyAll();
							System.out.println();
						}

					}
				}

			}

		}
	}
}