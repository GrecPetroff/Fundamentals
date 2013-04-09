package Synch;

public class CounterThread extends Thread{

    protected Counter counter = null;
    int id =0;
    

    public CounterThread(Counter counter,int n){
       this.counter = counter;
       id = n;
    }

    public void run() {
	for(int i=0; i<10; i++){
          counter.add(i);
          System.out.println("counter " + this.counter.count + " numb " + this.id );
       }
    }
 }