package com.gokul.designpatterns.factory;

public class DHL extends CourierService {
    @Override
    Transport getTransport() {
        return new SeaTransport();
    }
}
