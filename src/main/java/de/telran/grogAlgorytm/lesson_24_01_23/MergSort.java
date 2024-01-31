package de.telran.grogAlgorytm.lesson_24_01_23;

import java.util.ArrayList;
import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 7, 8, 9};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int index1 = 0;
        int index2 = 0;
        int index=0;
        int[] arr = new int[arr1.length+arr2.length];
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                arr[index++] = arr1[index1++];
            } else arr[index++] = arr2[index2++];
        }

        while (index1 < arr1.length) {
            arr[index++] = arr1[index1++];
        }

        while (index2 < arr2.length) {
            arr[index++] = arr2[index2++];
        }

        return arr;
    }

}
