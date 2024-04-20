package de.telran.javaPro.summary.work_24_04_19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExampleD7 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        int capacity = 15;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(7);
        list.add(17);
        list.add(77);
        fill(list, 15);
        System.out.println(list);
        System.out.println(list1);

        fillStream(list2,capacity);
        System.out.println(list2);

    }



    public static void fill(List<Integer> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
    }

    public static void fillStream(List<Integer> list, int capacity){
        IntStream.range(0,capacity)
                .forEach(i-> list.add(i));
    }
}
