package org.example;

public class SingleTon {
    private static final SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getSingletonInstance(){
        return singleTon;
    }
}
