package de.telran.javaPro.practicWithAlex.lesson_24_05_15;

import java.io.Serializable;

public class Person implements Serializable {
    private  String firstName;
    private  String lastName;
    private  Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
