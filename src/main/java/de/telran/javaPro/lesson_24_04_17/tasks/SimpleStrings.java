package de.telran.javaPro.lesson_24_04_17.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SimpleStrings {
    /**
     *Отсортировать с помощью стримов список из строк
     * - по алфавиту
     * - в обратном порядке
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10", "20", "1", "10", "50", "25", "20", "25");
       List<String> sorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        List<String> reversSorted = strings.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reversSorted);

        /**
         *  Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
         */

        List<Integer> integers = Arrays.asList(1,2,3,4);

        List<String> strings1 = integers.stream()
                .map(Objects::toString)
                .toList();

        System.out.println(strings1);

    }
}
