package de.telran.hexlet.forCodevars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumArray {

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "bdfghij";

        String result = longest(s1, s2);
        System.out.println(result);

        int[] array = {1, -3, -2, 6, 0, -9, 8, -8, 7, 8, -7, 0, 0, -5, -4, 4};

        int[] result1 = countPositiveAndSumNegative(array);

        System.out.println("Количество положительных чисел: " + result1[0]);
        System.out.println("Сумма отрицательных чисел: " + result1[1]);

    }

    public static String longest(String s1, String s2) {
        // Объединяем строки, удаляем повторяющиеся символы и сортируем
        String combined = (s1 + s2).chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
                .toString();

        return combined;
    }

    public static int[] countPositiveAndSumNegative(int[] array) {
        if (array == null) {
            // Возвращаем массив длиной 0, если входной массив null
            return new int[]{};
        }

        int countPositive = 0;
        int sumNegative = 0;

        for (int number : array) {
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                sumNegative += number;
            }
        }

        return new int[]{countPositive, sumNegative};
    }

//    public static int[] countPositiveAndSumNegative(int[] array) {
//        int countPositive = (int) Arrays.stream(array)
//                .filter(num -> num > 0)
//                .count();
//
//        int sumNegative = Arrays.stream(array)
//                .filter(num -> num < 0)
//                .sum();
//        return new int[]{countPositive, sumNegative};
//    }
}




