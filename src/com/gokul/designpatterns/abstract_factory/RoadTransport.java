package com.gokul.designpatterns.abstract_factory;

public class RoadTransport implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive Truck");
    }
}
