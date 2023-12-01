package de.telran.module2.lesson2;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {
    public static void main(String[] args) {
        List<String> myStringList = new LinkedList<>();
        myStringList.add("Sraka");
        myStringList.add("Banka");
        myStringList.add("Wokulary");
        System.out.println(myStringList);

        //myStringList.clear();

        for (String s : myStringList) {
            System.out.println(s + " ");
        }

        System.out.println(myStringList);
    }
}
