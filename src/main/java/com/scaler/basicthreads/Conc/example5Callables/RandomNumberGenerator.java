package com.scaler.basicthreads.Conc.example5Callables;

import ch.qos.logback.core.joran.conditional.ThenAction;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    //returns interger, usses call method
    @Override
    public Integer call() throws Exception {
        Random random =new Random();
        System.out.println("In thread random generator, starting");
        int n=random.nextInt();
        Thread.sleep(1000*10);
        System.out.println("In thread random generator, finished");
        return n;

    }
}
