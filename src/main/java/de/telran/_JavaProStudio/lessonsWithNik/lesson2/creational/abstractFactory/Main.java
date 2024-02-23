package de.telran._JavaProStudio.lessonsWithNik.lesson2.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new CoffixFactory());
        client.construct();
    }
}
