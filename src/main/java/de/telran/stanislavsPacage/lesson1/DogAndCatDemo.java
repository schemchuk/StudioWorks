package de.telran.stanislavsPacage.lesson1;

public class DogAndCatDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
        System.out.println();

        BigDog bigDog = new BigDog();
        System.out.println("==================");

        bigDog.voice();
        bigDog.voiceBigDog();
        System.out.println("======================");

        Cat cat = new Cat();
        cat.voice();


    }
}
