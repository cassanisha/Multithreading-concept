package com.scaler.basicthreads.Conc.example5Callables;

import java.util.concurrent.*;

public class Main {
    public static void main (String[] args) throws TimeoutException, ExecutionException, InterruptedException {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        ExecutorService es= Executors.newFixedThreadPool(2);
        //The task once on thread, we dont know when it will be end. So future waits for it to give integer
        //es is executing the thread
        Future<Integer>fi=es.submit(rng);
        System.out.println("Manager doing another task meanwhile Future waits for return");
        //We can use timeout after which it will give exception
        //While the thread is blocked: ( .get(): main thread waits until it gets the result
        //      It cannot proceed to execute other tasks.
        //      It essentially pauses at that point in the code, waiting for the result.
        int randomNo= fi.get(10, TimeUnit.SECONDS);
        System.out.println("Rando: "+ randomNo);
        es.shutdown();
    }
}
