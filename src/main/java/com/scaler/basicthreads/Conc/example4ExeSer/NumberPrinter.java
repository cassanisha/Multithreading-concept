package com.scaler.basicthreads.Conc.example4ExeSer;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in "+Thread.currentThread().getName());
        for( int i=0; i<100; i++ ){
            System.out.println(i+"hello" +Thread.currentThread().getName());
        }
    }
}
