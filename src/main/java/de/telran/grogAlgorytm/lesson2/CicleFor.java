package de.telran.grogAlgorytm.lesson2;

import java.util.Arrays;

public class CicleFor {
    public static void main(String[] args) {
        int[] array = {50, 40, 30, 20, 10};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                   // System.out.println(array);
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
