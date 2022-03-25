package com.codex.lang.java.basic;

public class ShutdownHook {
	
	public static void main(String [] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("JVM is going to shutdown. Perform the cleanup activity here");
				Runtime.getRuntime().halt(MAX_PRIORITY);
			}
		});
		System.out.println("JVM Closing in 3...2...1. Bye Bye");
	}

}
