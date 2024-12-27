package com.scaler.basicthreads.Conc.example7Mutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c= new Count();
        //As each thread should have same lock. we make lock in common area
        Lock lock=new ReentrantLock();
        Adder a= new Adder(c, lock);
        Subtractor s= new Subtractor(c, lock);
        /*ExecutorService es= Executors.newFixedThreadPool(2);

        es.execute(a);
        es.execute(s);
        //es prevents new tasks from being submitted to the ExecutorService.
        //However, it does not block or wait for the currently running tasks (Adder and Subtractor) to complete.
        es.shutdown();
        //Therefore different values at pot1 pot2 pot3.
        //If there will be one thread in threadpool. That thread will be given add and sub task sequentially.
        //So there will be no concurrency
        System.out.println(c.num); //pot 1
        System.out.println(a.count.num); //pot2
        System.out.println(s.count.num); //pot3
        //still different values. here mutex is applied but we are executing sout before thread task completion
        //do by t1.start(); approach
        */
        Thread t1=new Thread(a);
        Thread t2=new Thread(s);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.num); //pot 1
        System.out.println(a.count.num); //pot2
        System.out.println(s.count.num); //pot3
        //all same and final values are 0.

    }
}
