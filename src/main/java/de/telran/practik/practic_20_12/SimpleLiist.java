package de.telran.practik.practic_20_12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleLiist {
    public static void main(String[] args) {
        //Задача 1: Собрать элементы потока в список.
        List<String> task1 = Stream.of("A", "B", "C")
                .collect(Collectors.toList());
        System.out.println(task1);

        // Задача 2: Удалить дубликаты из списка и собрать их в множество.
        Set<String> task2Input = Arrays.asList("A", "B", "A", "C")
                .stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(task2Input);
        // Задача 3: Группировка строк по длине.
        Map<Integer, List<String>> task3 = (Map<Integer, List<String>>) Stream.of("apple", "banana", "cherry", "date")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(task3);

        // Задача 4: Подсчет повторяющихся элементов и создание мапа.
        List<String> task4Input = Arrays.asList("A", "B", "A", "C", "B", "A");

        //Map<String, Integer> countMap = task4Input.stream().collect(Collectors.toMap())

    }
}
