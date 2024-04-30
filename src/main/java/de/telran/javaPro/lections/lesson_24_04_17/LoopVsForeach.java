package de.telran.javaPro.lections.lesson_24_04_17;

import java.util.*;

public class LoopVsForeach {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);

        integers.forEach(element -> System.out.println(element));
        //integers.forEach(System.out::println);

        Set<String> set = new TreeSet<>();
//        set.forEach();

    }
}
