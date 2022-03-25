//package com.codex.lang.java.thread;
//
////public class ValidateWaitNotify_PC {
////	public static void main(String[] args) {
////		Object msg = new Object();	
////		Waiter wait = new Waiter(msg);
////		Notifier notify = new Notifier(msg);
////		
////		new Thread(wait, "wait").start();	
////		new Thread(notify, "notify").start();	
////
////	}	
//}
//
////class Notifier implements Runnable{
////	Object msg;
////	public Notifier(Object msg) {
////		this.msg = msg;
////	}
////	@Override
////	public void run() {
////		synchronized (msg) {
////			try {
////				System.out.println("Notifying the msg");
////				msg.notify();
////			} catch (Exception e) {
////				// TODO: handle exception
////			}
////			
////		}
////		
////	}
////}
//
//class Waiter implements Runnable{
//	Object msg;
//	public Waiter(Object msg) {
//		this.msg = msg;
//	}
//	@Override
//	public void run() {
//		synchronized (msg) {
//			try {
//				System.out.println("Waiting for Notified");
//				msg.wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//		}
//		
//	}
//	
//}
