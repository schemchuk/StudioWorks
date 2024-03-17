package de.telran.stanislavsPacage.lesson8.setCodeExample;

import java.util.HashSet;
import java.util.Set;

public class HachSetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("A");
        mySet.add("A");
        mySet.add("B");
        mySet.add("C");
        mySet.add("D");
        mySet.add("E");
        mySet.add("A");
        mySet.add("H");
        mySet.add("F");
        mySet.add("A");
        mySet.add("G");
        mySet.add("K");
        mySet.add("M");

        System.out.println(mySet);
    }
}
