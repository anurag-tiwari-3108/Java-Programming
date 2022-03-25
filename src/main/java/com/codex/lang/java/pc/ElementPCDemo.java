package com.codex.lang.java.pc;

public class ElementPCDemo {
	private static String cName = ElementPCDemo.class.getName()+" :: "; 
	public static void main(String ... args) throws InterruptedException{
		System.out.println(cName+"Calling the Threads ");
		final ElementsPC shared = new ElementsPC();
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		th1.start();
		th2.start();

		th1.join();
		th2.join();

	}

}
