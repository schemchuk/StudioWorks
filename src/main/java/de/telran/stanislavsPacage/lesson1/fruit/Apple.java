package de.telran.stanislavsPacage.lesson1.fruit;

import java.util.Arrays;

public class Apple extends  Fruit{
    private String color;
    public Apple(){
        System.out.print("Sub-class constructor invoked. Class - " + this.getClass().getName());
        System.out.println();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", vitamins=" + Arrays.toString(vitamins) +
                ", sugar=" + sugar +
                '}';
    }
}
