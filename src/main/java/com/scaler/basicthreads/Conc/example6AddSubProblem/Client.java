package com.scaler.basicthreads.Conc.example6AddSubProblem;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c= new Count();
        Adder a= new Adder(c);
        Subtractor s= new Subtractor(c);
        Thread t1= new Thread(a);
        Thread t2= new Thread(s);

        t1.start();
        t2.start();
        //if no join then t1 and t2 do context switching. value of c.num at pot1 different from pot2 pot3
        //bcz at each point of time thread t1 and t2 were still executing their task. Main thread didn't
        //wait for threads 1 & 2 to get completed before

        //main thread, wait for t1 to get executed. block yourself
        t1.join();
        //main thread, wait for t2 to get executed. block yourself
        t2.join();

        System.out.println(c.num); //pot 1
        System.out.println(a.count.num); //pot2
        System.out.println(s.count.num); //pot3
        //c value at pot1 pot2 pot3 coming out to be same but not zero. As context switching happening.
    }
}
