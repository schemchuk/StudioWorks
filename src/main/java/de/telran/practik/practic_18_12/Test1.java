package de.telran.practik.practic_18_12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Q","W","E","R");
//        list.forEach(System.out::println);

        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 15; i++){
            list1.add(new Random().nextInt(100));
        }
        System.out.println(list1);

       int a = list1.stream()
                .filter(digit -> digit % 2 == 0)
                .map(num -> (num + num) * num * 10)
                .reduce(Integer::sum)
                .get();
        System.out.println(a);
    }
}
