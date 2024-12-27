package com.scaler.basicthreads.Conc.example8synchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements  Runnable{
    Count count;


    public Adder(Count count){
        this.count=count;

    }

    @Override
    public void run() {
        System.out.println("Adder Started");
        for( int i=0; i<100000; i++ ){
            synchronized (count) {
                this.count.num+=1;
            }
        }
        System.out.println("Adder Finished");
    }
}
