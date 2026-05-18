package com.gokul.designpatterns.factory;

public class FedEx extends CourierService {
    @Override
    Transport getTransport() {
        return new RoadTransport();
    }
}
