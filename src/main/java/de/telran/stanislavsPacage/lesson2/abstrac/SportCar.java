package de.telran.stanislavsPacage.lesson2.abstrac;

public class SportCar extends Car{
    public SportCar(String model) {
        super(model);
    }

    @Override
    void speedUp() {
        System.out.println("SportCar speedUp");
    }
}
