package com.gokul.designpatterns.factory;

public class RoadTransport implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive Truck");
    }
}
