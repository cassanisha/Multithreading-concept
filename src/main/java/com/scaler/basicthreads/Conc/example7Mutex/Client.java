package com.scaler.basicthreads.Conc.example7Mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c= new Count();
        //As each thread should have same lock. we make lock in common area
        Lock lock=new ReentrantLock();
        Adder a= new Adder(c, lock);
        Subtractor s= new Subtractor(c, lock);

        Thread t1= new Thread(a);
        Thread t2= new Thread(s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.num); //pot 1
        System.out.println(a.count.num); //pot2
        System.out.println(s.count.num); //pot3
    }
}
