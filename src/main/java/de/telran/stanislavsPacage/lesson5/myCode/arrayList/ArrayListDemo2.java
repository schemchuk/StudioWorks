package de.telran.stanislavsPacage.lesson5.myCode.arrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(0,i);
        }
        System.out.println(integerArrayList);

        integerArrayList.remove((Integer) 4);
        System.out.println(integerArrayList);
    }
}
