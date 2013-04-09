package Synch;

public class Example {

    public static void main(String[] args){
      Counter counter = new Counter();
      Thread  threadA = new CounterThread(counter,1);
      Thread  threadB = new CounterThread(counter,2);

      threadA.start();
      threadB.start(); 
    }
  }
