package com.gokul.designpatterns.factory;

public abstract class CourierService {

    abstract Transport getTransport();

    public void sendParcel() {
        Transport transport = getTransport();
        transport.drive();
    }
}
