package de.telran.javaPro.summary.work_24_04_19;

import java.util.List;
import java.util.stream.IntStream;

public class Example7 {

    public static void fill(List<Integer> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
    }

    public static void fillStream(List<Integer> list, int capacity){
        IntStream.range(0,capacity)
                .forEach(i -> list.add(i));
    }
}
