package de.telran.module2.lesson3;

import java.util.List;
import java.util.ListIterator;

public class SimpleListIterator {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,3,4,5,4,9,8);
        System.out.println(intList);

        ListIterator<Integer> listIterator = intList.listIterator();
        while (listIterator.hasNext()) {
            int el = listIterator.next();
            System.out.println(el);
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            int el = listIterator.previous();
            System.out.println(el);
        }
    }
}
