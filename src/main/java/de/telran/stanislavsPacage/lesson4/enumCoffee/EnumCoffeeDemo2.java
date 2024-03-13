package de.telran.stanislavsPacage.lesson4.enumCoffee;

public class EnumCoffeeDemo2 {
    public static void main(String[] args) {

        for (EnumCoffee2.CoffeeSize coffeeSize : EnumCoffee2.CoffeeSize.values()) {
            System.out.println( coffeeSize + " " + coffeeSize.getMl());
        }

    }
}
