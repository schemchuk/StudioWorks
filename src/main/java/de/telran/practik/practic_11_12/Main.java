package de.telran.practik.practic_11_12;

import com.github.javafaker.Faker;

public class Main {
    private static final Library[] LIBRARIES = Generator.libraryGen();
    public static void main(String[] args) {
//        Handler.printAllAddresses(LIBRARIES);
//        Handler.printTotalBookCount(LIBRARIES);

        Faker faker = new Faker();
        faker.food().sushi();
        System.out.println(faker.food().sushi());
        for (int i = 0; i < 10; i++) {
            System.out.println(new Faker().book().author());
        }
    }
}