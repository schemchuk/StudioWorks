package de.telran.stanislavsPacage.lesson5.myCode.arrayList;

import java.util.ArrayList;

public class ArrayElementsDemo {
    public static void main(String[] args) {
        ArrayList<ArrayElement> arrayElements = new ArrayList<>();

        arrayElements.add(new ArrayElement(25,"Wasja",85));
        System.out.println(arrayElements);
    }
}
