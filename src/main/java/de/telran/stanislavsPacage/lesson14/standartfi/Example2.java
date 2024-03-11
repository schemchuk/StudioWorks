package de.telran.stanislavsPacage.lesson14.standartfi;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {

        int range =100;

        Supplier<Double> supplierDouble = () -> {
            Random random = new Random();
            return random.nextDouble(range);
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(supplierDouble.get());

        }

    }
}
