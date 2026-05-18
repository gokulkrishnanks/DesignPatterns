package com.gokul.designpatterns.strategy;

public class ToyotaHilux implements Car{
    @Override
    public void accelerate() {
        System.out.println("Accelerate to 100 kmph in 8 secs ");
    }

    @Override
    public void brake() {
        System.out.println("Apply brake");
    }
}
