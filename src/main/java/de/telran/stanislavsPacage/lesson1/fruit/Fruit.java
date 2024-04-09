package de.telran.stanislavsPacage.lesson1.fruit;

import java.util.Arrays;

public class Fruit {
    public String[] vitamins;
    public int sugar;

    public Fruit() {
        System.out.print("Super class constructor. Class - ");
        System.out.println(this.getClass().getName());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "vitamins=" + Arrays.toString(vitamins) +
                ", sugar=" + sugar +
                '}';
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
