package com.gokul.designpatterns.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        MyRegistry myRegistry = MyRegistry.INSTANCE;
        System.out.println(myRegistry.getDescription());
        System.out.println(myRegistry.getDetails());
    }
}
