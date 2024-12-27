package com.scaler.basicthreads.Conc.example9syncMethods;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Adder adder = new Adder(c);
        Subtractor subtractor = new Subtractor(c);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.num); //pot 1
        System.out.println(adder.count.num); //pot2
        System.out.println(subtractor.count.num); //pot3
        //all same and final values are 0.
    }
}
