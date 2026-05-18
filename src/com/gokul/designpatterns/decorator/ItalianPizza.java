package com.gokul.designpatterns.decorator;

public class ItalianPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Italian Pizza ";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}
