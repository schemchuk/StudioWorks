package de.telran.stanislavsPacage.lesson14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreanExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();
    }
}
