package com.gokul.designpatterns.abstract_factory;

public class DHL extends CourierService {
    @Override
    Transport createTransport() {
        return new SeaTransport();
    }
}
