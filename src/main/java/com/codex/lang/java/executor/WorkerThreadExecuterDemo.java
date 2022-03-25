package com.codex.lang.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadExecuterDemo {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(14);
		for (int i = 0; i < 14; i++) {
			ex.execute(new Runnable() {

				public void run() {
					ProcessAgentData agent = new ProcessAgentData();
					try {
						agent.processAgentData (getInitiator());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				private synchronized String getInitiator() throws InterruptedException {	
											
					long initiator = 980000 + Thread.currentThread().getId();
					System.out.println("WorkerThreadExecuterDemo :: Initiator "+initiator+" For thread "+Thread.currentThread().getName());
					
					return initiator + "";
				}

			});
		}
	}
}