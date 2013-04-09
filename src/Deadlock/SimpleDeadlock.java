package Deadlock;
public class SimpleDeadlock {
	  public static void main(String[] args) {
	    final Object resource1 = "resource1";
	    final Object resource2 = "resource2";
	   
	    // First thread tries to lock resource1 then resource2
	    Thread firstThread = new Thread() {
	      public void run() {
	        // Lock resource 1
	        synchronized (resource1) {
	          System.out.println("Thread 1: locked resource 1");

	          try {
	            Thread.sleep(50);
	          } catch (InterruptedException e) {
	          }

	          synchronized (resource2) {
	            System.out.println("Thread 1: locked resource 2");
	          }
	        }
	      }
	    };


	    // SecondThread tries to lock resource2 then resource1
	    Thread secondThread = new Thread() {
	      public void run() {
	        synchronized (resource2) {
	          System.out.println("Thread 2: locked resource 2");

	          try {
	            Thread.sleep(50);
	          } catch (InterruptedException e) {
	          }

	          synchronized (resource1) {
	            System.out.println("Thread 2: locked resource 1");
	          }
	        }
	      }
	    };


	    firstThread.start();
	    secondThread.start();
	  }
	}
	           