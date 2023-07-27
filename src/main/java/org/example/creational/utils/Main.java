package org.example.creational.utils;

import org.example.creational.fabric.MercedesCar;
import org.example.creational.prototype.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person.Builder("Eugen", "Demyanovich")
                .highEducation("BSUIR")
                .birthDate(new Date())
                .car(new MercedesCar())
                .build();

        Person person1 = (Person) person.clone();
        System.out.println(person1);
    }
}
