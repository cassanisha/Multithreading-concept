package com.scaler.basicthreads.Conc.example8synchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{
    Count count;
    public Subtractor(Count count ) {
        this.count=count;
    }

    @Override
    public void run() {
        System.out.println("Subtractor started");
        for( int i=0; i<100000; i++ ){
            synchronized (count) {
                this.count.num-=1;
            }
        }
        System.out.println("Subtractor finished");
    }
}