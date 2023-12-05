package de.telran.module2.lesson4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleTreeSet {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("T");
        sortedSet.add("A");
        sortedSet.add("V");
        sortedSet.add("B");
        System.out.println(sortedSet);
    }
}
