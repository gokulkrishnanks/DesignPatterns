package com.gokul.designpatterns.singleton;

public enum MyRegistry {

    INSTANCE;

    private final String description;

    private final String details;


    MyRegistry() {
        description = "some description";
        details = "some details";
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }
}
