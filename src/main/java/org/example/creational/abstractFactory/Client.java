package org.example.creational.abstractFactory;

public class Client {
    private final AbstractProductA productA;
    private final AbstractProductB productB;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void run() {
        productA.operationA();
        productB.operationB();
    }

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.run(); // Вывод: ConcreteProductA1: operationA
                      //        ConcreteProductB1: operationB

        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.run(); // Вывод: ConcreteProductA2: operationA
                      //        ConcreteProductB2: operationB
    }
}
