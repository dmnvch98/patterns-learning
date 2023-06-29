package org.example.creational.builder;

import org.example.creational.fabric.Car;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private Date birthDate;
    private String highEducation;
    private Car car;

    private Person(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.birthDate = builder.birthDate;
        this.highEducation = builder.highEducation;
        this.car = builder.car;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getHighEducation() {
        return highEducation;
    }

    public Car getCar() {
        return car;
    }

    public static class Builder{
        private final String name;
        private final String lastName;
        private Date birthDate;
        private String highEducation;
        private Car car;
        public Builder(String name, String lastName) {
            if (name == null || lastName == null) {
                throw new IllegalArgumentException("Name and last name should not be null...");
            } else {
                this.name = name;
                this.lastName = lastName;
            }
        }

        public Builder birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder highEducation(String highEducation) {
            this.highEducation = highEducation;
            return this;
        }

        public Builder car(Car car) {
            this.car = car;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", birthDate=" + birthDate +
            ", highEducation='" + highEducation + '\'' +
            ", car=" + car +
            '}';
    }
}
