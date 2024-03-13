package de.telran.javaPro.lections.lesson_24_03_11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        ListIterator<Integer> listIterator = integerList.listIterator();
        listIterator.next();
        listIterator.next();
        //listIterator.add(99);
        listIterator.remove();
        System.out.println(integerList);


    }
}
