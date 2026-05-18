package com.gokul.designpatterns.decorator;

public class SauceDecorator extends PizzaDecorator {

    Pizza pizza;

    public SauceDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " " + " Sauce ";
    }

    public double getCost() {
        return pizza.getCost() + 0.5;
    }

}
