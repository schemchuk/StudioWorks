package de.telran.stanislavsPacage.lesson4.enumCoffee;

public class EnumCoffeeDemo {
    public static void main(String[] args) {
        EnumCoffee drink = new EnumCoffee();

        drink.size = EnumCoffee.CoffeeSize.Big;

        EnumCoffee drink2 = new EnumCoffee();

        drink2.size = EnumCoffee.CoffeeSize.Big;

        System.out.println(drink.size == drink2.size);

    }
}
