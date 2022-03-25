package com.codex.lang.java.concurrency;

import java.util.concurrent.Semaphore;

/**
 * A semaphore controls access to a shared resource through the use of a
 * counter. If the counter is greater than zero, then access is allowed. If it
 * is zero, then access is denied. What the counter is counting are permits that
 * allow access to the shared resource. Thus, to access the resource, a thread
 * must be granted a permit from the semaphore.
 * 
 * 
 * Constructors in Semaphore class : There are two constructors in Semaphore
 * class.
 * 
 * Semaphore(int num) Semaphore(int num, boolean how) Here, num specifies the
 * initial permit count. Thus, it specifies the number of threads that can
 * access a shared resource at any one time. If it is one, then only one thread
 * can access the resource at any one time. By default, all waiting threads are
 * granted a permit in an undefined order. By setting how to true, you can
 * ensure that waiting threads are granted a permit in the order in which they
 * requested access.
 * 
 * @author anutiwar
 *
 */
public class SemaphoreThread extends Thread 
{ 
    Semaphore sem; 
    String threadName; 
    public SemaphoreThread(Semaphore sem, String threadName)  
    { 
        super(threadName); 
        this.sem = sem; 
        this.threadName = threadName; 
    } 
   
    @Override
    public void run() { 
           
            // First, get a permit. 
            System.out.println(threadName + " is waiting for a permit."); 
            
               try { 
                 // acquire method 
                sem.acquire(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
               
               System.out.println(threadName + " gets a permit"); 
           
            // Now, critical section 
            // other waiting threads will wait, until this 
               // thread release the lock 
            for(int i=0; i < 2; i++) 
            { 
                 // hasQueuedThreads() methods 
                 boolean b = sem.hasQueuedThreads(); 
                 if(b) 
                     // getQueuedLength() methods 
                     System.out.println("Length of Queue : " + sem.getQueueLength())    ; 
           
                 // Now, allowing a context switch -- if possible. 
                 try { 
                    Thread.sleep(10); 
                } catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
     
           
            // Release the permit. 
            System.out.println(threadName + " releases the permit."); 
                  
            // release() method 
            sem.release(); 
        } 
} 