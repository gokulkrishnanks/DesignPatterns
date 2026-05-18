package com.gokul.designpatterns.abstract_factory;

public class FedEx extends CourierService {
    @Override
    Transport createTransport() {
        return new RoadTransport();
    }
}
