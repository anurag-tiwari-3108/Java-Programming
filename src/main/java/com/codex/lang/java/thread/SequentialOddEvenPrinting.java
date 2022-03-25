package com.codex.lang.java.thread;

/**
 * Thread-1 : 1 ODD Thread-2 : 2 EVEN
 * 
 * printZeroNumber():: Thread-1 :: 0 printOddNumber():: Thread-2 :: 1
 * printEvenNumber():: Thread-3 :: 2 printOddNumber():: Thread-2 :: 3
 * printEvenNumber():: Thread-3 :: 4 printOddNumber():: Thread-2 :: 5
 * printEvenNumber():: Thread-3 :: 6 printOddNumber():: Thread-2 :: 7
 * printEvenNumber():: Thread-3 :: 8 printOddNumber():: Thread-2 :: 9
 * printEvenNumber():: Thread-3 :: 10
 * 
 * @author anutiwar
 *
 */
public class SequentialOddEvenPrinting {

	int counter = 0;
	static int n;

	public static void main(String[] args) {
		n = 10;
		SequentialOddEvenPrinting poe = new SequentialOddEvenPrinting();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				poe.printZeroNumber();
			}
		}, "Thread-1");

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				poe.printOddNumber();
			}
		}, "Thread-2");

		Thread t3 = new Thread(new Runnable() {
			public void run() {
				poe.printEvenNumber();
			}
		}, "Thread-3");
		t1.start();
		t2.start();
		t3.start();

	}

	public void printZeroNumber() {
		synchronized (this) {
			while (counter != 0) {

			}
			System.out.println("printZeroNumber():: " + Thread.currentThread().getName() + " :: " + counter);
			counter++;
		}
	}

	// Aquring the lock only when the number is not odd else printing the number
	public void printOddNumber() {
		synchronized (this) {
			while (counter < n) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("printOddNumber():: " + Thread.currentThread().getName() + "   ::  " + counter);
				counter++;
				notify();
			}
		}
	}

	// Aquring the lock only when the number is not even else printing the number
	public void printEvenNumber() {
		synchronized (this) {
			while (counter < n) {
				while (counter % 2 != 0) {
					// System.out.println("printEven current counter " + counter + " number " + n);
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("printEvenNumber():: " + Thread.currentThread().getName() + "   :: " + counter);
				counter++;
				notify();
			}
		}
	}

}
