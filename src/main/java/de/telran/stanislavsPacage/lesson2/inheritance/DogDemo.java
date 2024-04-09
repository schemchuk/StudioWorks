package de.telran.stanislavsPacage.lesson2.inheritance;

public class DogDemo {
    public static void main(String[] args) {
        BigDog bigDog = new BigDog();
        SmallDod smallDod = new SmallDod();

        bigDog.voice();
        bigDog.voiceBigDog();
        System.out.println("========================");

        smallDod.voice();
    }
}
