package com.scaler.basicthreads.Conc.example8synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c= new Count();

        Adder a= new Adder(c);
        Subtractor s= new Subtractor(c);

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
