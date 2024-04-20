package de.telran.stanislavsPacage.lesson14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5);

        System.out.println(numbers);

        List<Integer> square = numbers.stream()
                .map(x -> x*x)
                .toList();

        System.out.println(square);

        //-------------------- task 1-------

        List<String> words = Arrays.asList("Java", "Collections", "Stream", "Array", "System");

        List<String> result = words.stream()
                .filter(s -> s.startsWith("S"))
                .toList();

        System.out.println(result);

        //-------------------- task 2-------

        List<Integer> numbers2 = Arrays.asList(2,3,4,5,2,4);

        System.out.println(numbers2);

        List<Integer> squareUniq = numbers2.stream()
                .distinct()
                .map(x -> x*x)
                .toList();

        System.out.println(squareUniq);

        //-------------------- task 3 два варианта -------

        Set<Integer> squareUniqSet = numbers2.stream()
                .map(x -> x*x)
                .collect(Collectors.toSet());

        System.out.println(squareUniqSet);

        List<Integer> listFromSet = squareUniqSet.stream()
                .sorted()
                .toList();

        System.out.println(listFromSet);
        //-------------------- task 4 -------


    }
}
