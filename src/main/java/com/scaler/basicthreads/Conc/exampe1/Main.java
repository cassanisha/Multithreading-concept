package com.scaler.basicthreads.Conc.exampe1;

public class Main {
    //p1t1
    public static void main(String[] args) {
        //p1t2
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        //thread.run()
        thread.start(); //at last run is executed but before that some java code is executed that makes a new thread 
        System.out.println("Main thread started, it is: "+ Thread.currentThread().getName());
    }
}
