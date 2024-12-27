package com.scaler.basicthreads.Conc.example9syncMethods;

public class Count {
    int num;
    synchronized void increment() {
        num++;
    }
    synchronized void decrement() {
        num--;
    }
}
