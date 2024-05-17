package de.telran.javaPro.practicWithAlex.lesson_24_05_15;

import java.io.Serializable;

public class Address implements Serializable {
    private  int countryCode;
    private  String city;
    private  String street;

    public Address(int countryCode, String city, String street) {
        this.countryCode = countryCode;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryCode=" + countryCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
