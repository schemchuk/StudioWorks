package de.telran.module1.practic._1129;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Taski1129_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3));

        removeDuplicates(list);


        System.out.println(list);
    }

    public static void removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        list.clear();
        list.addAll(uniqueList);
    }
}

