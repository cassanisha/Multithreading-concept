package com.scaler.basicthreads.Conc.example7Mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements  Runnable{
    Count count;
    Lock lock;

    public Adder(Count count, Lock
                 lock){
        this.count=count;
        this.lock=lock;
    }

    @Override
    public void run() {
        System.out.println("Adder Started");
        for( int i=0; i<100000; i++ ){
            lock.lock();
            this.count.num+=1;
            lock.unlock();
        }
        System.out.println("Adder Finished");
    }
}
