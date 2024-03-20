package de.telran.stanislavsPacage.lesson9.lessoncod;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<String> myset = new HashSet<>();
        myset.add("Sraka");
        myset.add("Banka");
        myset.add("Wokulary");
        myset.add("Wokulary");
        System.out.println("our set collection " + myset);


        if (myset.contains("Sraka")) {

            System.out.println("our HashSet contain 'Sraka' ");
        } else {
            System.out.println("our HashSet not contain 'Sraka' " );
        }

        int size = myset.size();
        System.out.println(size);

        for (String str : myset){
            System.out.println(str);
          //  myset.remove(str);
        }

    }
}
