package com.scaler.basicthreads.Conc.Generics;

import lombok.Getter;
import lombok.Setter;

public class Pair <K,V> {
    @Setter
    @Getter
    K obj1;
    V obj2;
    public Pair(K obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


}
