package org.example.creational.fabric;

class Executor {
    public static void main(String[] args) {
        Fabric carFabric = new CarFabric();

        Car car = carFabric.createCar("Mercedes");

        car.description();
    }
}
