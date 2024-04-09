package de.telran.stanislavsPacage.lesson2.abstrac;

public class Truck extends Car{

    public Truck(String model) {
        super(model);
    }

    @Override
    void speedUp() {

        System.out.println("TRUCK");
    }
}
