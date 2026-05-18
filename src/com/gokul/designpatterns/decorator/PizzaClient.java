package com.gokul.designpatterns.decorator;

public class PizzaClient {

    public static void main() {

        Pizza pizza = new ParmesanDecorator(new NYPizza());
        pizza = new SauceDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}
