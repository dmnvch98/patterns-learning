package org.example.creational.prototype;

import org.example.creational.fabric.MercedesCar;

import java.util.Date;

public class Executor {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person.Builder("Eugen", "Demyanovich")
                .highEducation("BSUIR")
                .birthDate(new Date())
                .car(new MercedesCar())
                .build();
        Person person1 = (Person) person.clone();

//        System.out.println(person1 + " / " + person);
        System.out.println(person1);
    }
}
