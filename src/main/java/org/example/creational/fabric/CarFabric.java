package org.example.creational.fabric;

public class CarFabric implements Fabric {

    @Override
    public Car createCar(String name) {
        if (name.equals("BMW")) {
            return new BmwCar();
        } else {
            return new MercedesCar();
        }
    }
}

