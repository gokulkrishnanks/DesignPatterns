package com.gokul.designpatterns.decorator;

public class NYPizza extends Pizza {
    @Override
    public String getDescription() {
        return "NY Pizza ";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
