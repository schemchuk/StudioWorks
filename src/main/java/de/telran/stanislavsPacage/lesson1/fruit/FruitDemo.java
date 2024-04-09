package de.telran.stanislavsPacage.lesson1.fruit;

public class FruitDemo {
    public static void main(String[] args) {

        Pineapple pineapple = new Pineapple();
        pineapple.setCellulose(20);
        pineapple.setSugar(10);
        pineapple.setVitamins(new  String[] {"A","B"});
        System.out.println(pineapple);

        System.out.println("============================");

        Apple apple = new Apple();
        apple.setColor("Red");
        apple.setSugar(15);
        apple.setVitamins(new  String[] {"C","D"});
        System.out.println(apple);


    }
}
