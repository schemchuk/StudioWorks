package de.telran.stanislavsPacage.lesson4.objectCopy;

public class PinokkioDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book pinokkio = new Book("Pinokkio", 1950);
        System.out.println(pinokkio);


        //===========================================

        Book mirracle = new Book(pinokkio.getName(), pinokkio.getYear());//pinokkio;
        //mirracle.setName("Mirracle");

        System.out.println(pinokkio);
        mirracle.setName("Mirracle");
        System.out.println(mirracle);


        //========================================

        Book buratino = pinokkio.clone();
        buratino.setName("Buratino");
        System.out.println(buratino);

    }
}
