package de.telran.grogAlgorytm._16_01_24;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinArraus {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 8, 10};
        int[] array2 = {3, 4, 7, 8, 11, 13, 14};
        System.out.println(Arrays.toString(merge(array1,array2)));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr= new int[arr1.length+arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++]=arr1[i++];
            } else {
                arr[k++]=arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr[k++]=arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++]=arr2[j++];
        }

        return arr;
    }
}

