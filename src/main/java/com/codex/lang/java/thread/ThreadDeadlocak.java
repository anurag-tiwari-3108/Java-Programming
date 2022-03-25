package com.codex.lang.java.thread;

public class ThreadDeadlocak {

	public static void main(String[] args) {
		System.out.println("Going into the DEADLOCK...3..2..1");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
