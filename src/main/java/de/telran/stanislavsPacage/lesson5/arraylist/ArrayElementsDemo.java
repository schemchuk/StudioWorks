package de.telran.stanislavsPacage.lesson5.arraylist;

import java.util.ArrayList;

public class ArrayElementsDemo {
    public static void main(String[] args) {
        ArrayList<ArrayElement> arrayElements = new ArrayList<>();

        arrayElements.add(new ArrayElement(25,"John", 85));

        System.out.println(arrayElements);
    }
}
