package de.telran.stanislavsPacage.lesson1.fruit;

import java.util.Arrays;

public class Pineapple extends  Fruit{
    private int cellulose;
    public Pineapple(){
        System.out.print("Sub-class constructor invoked. Class - " + this.getClass().getName());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "cellulose=" + cellulose +
                ", vitamins=" + Arrays.toString(vitamins) +
                ", sugar=" + sugar +
                '}';
    }

    public int getCellulose() {
        return cellulose;
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }
}
