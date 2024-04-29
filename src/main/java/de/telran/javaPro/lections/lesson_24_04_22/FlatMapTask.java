package de.telran.javaPro.lections.lesson_24_04_22;

import java.util.Arrays;
import java.util.List;

public class FlatMapTask {
    public static void main(String[] args) {
        // Имеется два списка элементов.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        // С помощью flatMap():
        // a). Получить все возможные значения сумм чисел из обоих списков

        list1.stream()
                .flatMap(el1 -> list2.stream()
                        .map(el2 -> el1 + el2))
                .forEach(System.out::println);

        // b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]

//        List<Integer[]> list = list1.stream()
//                .flatMap(el1 -> list2.stream()
//                        .map(el2 -> new Integer[]{el1, el2}))
//                .toList();
//       list.forEach(e -> System.out.println(Arrays.toString(e)));

       Integer[][] array = list1.stream()
                .flatMap(el1 -> list2.stream()
                        .map(el2 -> new Integer[]{el1, el2}))
                .toArray(Integer[][] ::new);
        System.out.println(Arrays.deepToString(array));

        // с). Найти все пары чисел, сумма которых будет равна заданному значению sum
        int sum = 7;
//      Integer[][] pairsWithSum =   list1.stream()
//                .flatMap(el1 -> list2.stream()
//                        .filter(el2 -> el1 + el2 == sum)
//                        .map(el2 -> new Integer[]{el1,el2}))
//                        .toArray(Integer[][] ::new);
//        System.out.println(Arrays.deepToString(pairsWithSum));

        List<Integer[]> list = list1.stream()
                .flatMap(el1 -> list2.stream()
                        .map(el2 -> new Integer[]{el1, el2}))
                .filter(el -> el[0] + el[1] == sum)
                .toList();
        list.forEach(el -> {
            System.out.println(Arrays.toString(el));

    });

    }
}