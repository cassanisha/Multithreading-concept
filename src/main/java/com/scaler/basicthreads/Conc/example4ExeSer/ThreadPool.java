package com.scaler.basicthreads.Conc.example4ExeSer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        //main thread
        System.out.println("You know I am in "+Thread.currentThread().getName());
        //interface a= class b.method c
        // c is a static method in class b that returns an instance of the interface
        ExecutorService es= Executors.newFixedThreadPool(2);
        for( int i=0; i<3; i++ ){
            es.execute(np);
        }
        //need to shut down the thread pool as it will keep hogging memory if not shut
        es.shutdown();
    }



}
