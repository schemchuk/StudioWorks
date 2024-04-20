package de.telran.stanislavsPacage.lesson14.standartfi.examples;

import java.util.Random;
import java.util.function.Supplier;

public class Exampe11 {
    public static void main(String[] args) {
        String str = "Hello World";

        int range = 100;

        Supplier<String> stringSupplier   = () -> str.toUpperCase();
        System.out.println(stringSupplier.get());

        Supplier<Double> doubleSupplier = () -> {
            Random random = new Random();


            return random.nextDouble(range);
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(doubleSupplier.get());
        }

    }
}
