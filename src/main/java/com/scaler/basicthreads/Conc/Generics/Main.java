package com.scaler.basicthreads.Conc.Generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> psi= new Pair<>(4, "Sri");
        print(psi.obj2);

    }
    public static <T> void print(T something){
        System.out.println(something);
    }
}
