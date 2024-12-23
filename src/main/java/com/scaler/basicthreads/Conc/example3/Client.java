package com.scaler.basicthreads.Conc.example3;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        Thread a=new Thread(new Adder());
        Thread b=new Thread(new Subtractor());
        a.start();
        b.start();
    }
}
