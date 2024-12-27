package com.scaler.basicthreads.Conc.example6AddSubProblem;

public class Adder implements  Runnable{
    Count count;

    public Adder(Count count ){
        this.count=count;
    }

    @Override
    public void run() {
        for( int i=0; i<100000; i++ ){
            this.count.num+=1;
        }
    }
}
