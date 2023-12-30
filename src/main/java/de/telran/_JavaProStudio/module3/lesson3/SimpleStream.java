package de.telran._JavaProStudio.module3.lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        System.out.println("-------------");
        List<String> list = Arrays.asList("12","15","28","12", "1","51");
        System.out.println(list);
       long c = list.stream().filter(p -> p.equals("12")).peek(p -> System.out.println(p)).count();
        System.out.println("count  = " + c);

        System.out.println("------------Sorted---------");

        List<String> listResult = list.stream().sorted().collect(Collectors.toList());


        System.out.println(listResult);

        listResult = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(listResult);

        System.out.println("------------Sorted + Limit");


        System.out.println(" ------------------------Skip_________________");
        Stream<String> stream1 = list.stream();
        //String stream2.sorted();
    }
}
