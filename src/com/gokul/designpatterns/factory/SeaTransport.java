package com.gokul.designpatterns.factory;

public class SeaTransport implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive Ship");
    }
}
