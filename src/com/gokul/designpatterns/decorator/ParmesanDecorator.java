package com.gokul.designpatterns.decorator;

public class ParmesanDecorator extends PizzaDecorator{

    Pizza pizza;

    public ParmesanDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " " + " Parmesan ";
    }

    public double getCost() {
        return pizza.getCost() + 0.75;
    }
}
