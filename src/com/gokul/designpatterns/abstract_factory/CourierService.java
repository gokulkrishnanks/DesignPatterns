package com.gokul.designpatterns.abstract_factory;

public abstract class CourierService {

    abstract Transport createTransport();

    public void sendParcel() {
        Transport transport = createTransport();
        transport.drive();
    }
}
