package de.telran.stanislavsPacage.lesson9.compareObjekt.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> mytreeSet = new TreeSet<>();
        mytreeSet.add("AAA");
        mytreeSet.add("SSS");
        mytreeSet.add("HHH");
        mytreeSet.add("AAA");
        mytreeSet.add("FFF");
        mytreeSet.add("EEE");
        mytreeSet.add("EEE");
        mytreeSet.add("AAA");
        System.out.println(mytreeSet);
    }
}
