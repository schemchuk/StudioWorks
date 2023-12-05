package de.telran.module2.lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(2);
        myIntList.add(5);
        myIntList.add(3);
        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(1);
        System.out.println(myIntList);

        Iterator<Integer> iterator = myIntList.iterator();
        while (iterator.hasNext()) {
            int elInt = iterator.next();
            System.out.println(elInt);
        }
        System.out.println();

        for (int el : myIntList) {
            System.out.println(el);
        }
    }
}
