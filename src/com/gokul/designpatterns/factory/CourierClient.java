package com.gokul.designpatterns.factory;

public class CourierClient {

    public static void main(String[] args) {
        CourierService courierService = new DHL();
        courierService.sendParcel();

        CourierService courierService2 = new FedEx();
        courierService2.sendParcel();
    }
}
