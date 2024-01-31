package de.telran.grogAlgorytm.lesson_24_01_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,2, 4, 6, 7, 8, 9};
        System.out.println(Arrays.toString(mergeSort(arr)));
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
    public static int[] mergeSort(int[] arr) {
        if (arr.length<=1) return arr;
        int[] left = Arrays.copyOfRange(arr,0,arr.length/2);
        int[] right = Arrays.copyOfRange(arr,arr.length/2,arr.length);
        return merge(mergeSort(left),mergeSort(right));

    }


}

