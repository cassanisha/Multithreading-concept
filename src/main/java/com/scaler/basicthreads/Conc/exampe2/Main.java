package com.scaler.basicthreads.Conc.exampe2;

public class Main {
    public static void main(String[] args) {
        OddPrinter oddPrinter = new OddPrinter();
        EvenPrinter evenPrinter = new EvenPrinter();
        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);
        oddThread.start();
        evenThread.start();
        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}
