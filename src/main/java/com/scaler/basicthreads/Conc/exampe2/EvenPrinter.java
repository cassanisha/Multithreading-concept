package com.scaler.basicthreads.Conc.exampe2;

public class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=100; i++){
            if(i%2==0){
                System.out.println("Even Thread: "+i+" ");
            }
        }

    }
}
