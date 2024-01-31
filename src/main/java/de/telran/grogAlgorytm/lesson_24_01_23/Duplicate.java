package de.telran.grogAlgorytm.lesson_24_01_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        System.out.println(binarySort(arr));
    }
    public static int binarySort(int[] arr) {
        int totalSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            sum += i;
        }
        return totalSum - sum;
    }

}
