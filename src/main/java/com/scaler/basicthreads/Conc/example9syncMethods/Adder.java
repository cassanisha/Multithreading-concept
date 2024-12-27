package com.scaler.basicthreads.Conc.example9syncMethods;

public class Adder implements Runnable {
    Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.increment();
        }
    }
}
