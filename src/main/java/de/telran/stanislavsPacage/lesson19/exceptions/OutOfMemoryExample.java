package de.telran.stanislavsPacage.lesson19.exceptions;

import java.util.ArrayList;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        OutOfMemoryExample example = new OutOfMemoryExample();

        ArrayList newList = new ArrayList<>();
        int count = 0;

        while (true) {
            newList.add(example.newStringArray());
            count++;
        }
    }

    String[] newStringArray() {
        String[] newArray = new  String[1000000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = "fkbgfkblkgrbtrhktkljbrntrtpjbtbtr";
        }
        return newArray;
    }

}
