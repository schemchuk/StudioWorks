package de.telran.grogAlgorytm.lesson_24_02_06;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 7, 1, 2, 9, 8, 3, 0, 10, 5};
        System.out.println(Arrays.toString(arrange(array,0,array.length-1)));
    }
    public static int[] arrange(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start;
        for (int i = 0; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return arr;
    }

}
