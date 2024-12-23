package com.scaler.basicthreads.Conc.exampe1;

public class BasicThread implements Runnable {
    @Override
    public void run() {
        System.out.println("I am in a new thread, name of thread is:  " + Thread.currentThread().getName());
    }
}
