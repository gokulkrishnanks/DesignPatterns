package com.gokul.designpatterns.strategy;

public class Client {

    public static void main() {
        Car car = new LamborghiniHuracan();
        CarDriver driver = new CarDriver(car);
        driver.drive();
        driver.stop();
    }
}
