package de.telran.stanislavsPacage.lesson9.lessoncod;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> myset = new HashSet<>();
        myset.add(10);
        myset.add(20);
        myset.add(30);
        myset.add(10);
        System.out.println("our set collection " + myset);

        myset.remove(20);
        System.out.println("our set collection " + myset);

        myset.clear();
        System.out.println("our set collection " + myset);



    }
}
