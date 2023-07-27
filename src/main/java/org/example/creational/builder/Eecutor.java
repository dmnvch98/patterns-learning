package org.example.creational.builder;

import org.example.creational.fabric.MercedesCar;

import java.util.Date;

public class Eecutor {
    public static void main(String[] args) {
        Person person = new Person.Builder("Eugen", "Demyanovich")
            .highEducation("BSUIR")
            .birthDate(new Date())
            .car(new MercedesCar())
            .build();

        System.out.println(person);

    }
}
