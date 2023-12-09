package de.telran._JavaProStudio.module1.practic._1129;

import java.util.ArrayList;
import java.util.List;

public class Taski1129 {
    //Дан массив/коллекция целых чисел и целое число X.
    // Найти пару чисел в массиве/коллекции, сумма которых равна X.
    public static void main(String[] args) {
        // int[] array = {1, 2, 3,4, 5, 6, 7};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int targetSum = 8;

        findPair(list, targetSum);

    }
    static void findPair(List<Integer> list, int targetSum) {
        int left =0;
        int right = list.size() -1;

        while ( left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == targetSum) {
                System.out.println("Подходит пара : " + list.get(left) + " " + list.get(right));

                return;
                } else if (sum < targetSum) {
                left++;
            }else {
                right--;
           }
        }
//Дан массив/коллекция целых чисел. Необходимо подсчитать,
// сколько раз каждый элемент встречается в массив/коллекции.

        // - Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.


    }
}
