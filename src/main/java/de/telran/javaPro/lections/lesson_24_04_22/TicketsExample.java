package de.telran.javaPro.lections.lesson_24_04_22;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Имеется два списка элементов.
 * List<Integer> list1 = Arrays.asList(1, 2, 3);
 * List<Integer> list2 = Arrays.asList(4, 5, 6);
 * С помощью flatmap:
 * a). Получить все возможные значения сумм чисел из обоих списков
 * b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
 * с). Найти все пары чисел, сумма которых будет равна заданному значению sum
 */
public class TicketsExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        //Получить все возможные значения сумм чисел из обоих списков
        list1.stream()
                .flatMap(el -> list2.stream().map(el2 -> el + el2))
                .forEach(System.out::println);

        //Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
//
//        List<List<Integer>> paarsList = list1.stream()
//                .flatMap(el1 -> list2.stream().map(num2 -> Arrays.asList(el1,num2)))
//                .toList();
//
//        System.out.println(paarsList);


//        List<List<Integer>> list = list1.stream()
//                .flatMap(el1 -> list2.stream().map(el2 -> new Integer(){}{el1,el2})).toList();

        //Найти все пары чисел, сумма которых будет равна заданному значению sum

//        list1.stream().flatMap(el1 -> list2.stream().map(el2 -> new Integer()[]{el1,el2 ))
    }
}
