package com.gokul.designpatterns.strategy;

public class CarDriver {

    private Car car;

    public CarDriver(Car car) {
        this.car = car;
    }

    public void drive() {
        car.accelerate();

    }

    public void stop() {
        car.brake();
    }
}
