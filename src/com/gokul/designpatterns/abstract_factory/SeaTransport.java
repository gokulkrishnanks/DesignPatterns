package com.gokul.designpatterns.abstract_factory;

public class SeaTransport implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive Ship");
    }
}
