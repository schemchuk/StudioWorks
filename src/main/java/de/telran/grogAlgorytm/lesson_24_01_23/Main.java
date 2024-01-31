package de.telran.grogAlgorytm.lesson_24_01_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,0,1,1,1,0,1,0};
        System.out.println(Arrays.toString(binarySort(arr)));
    }
    public static int[] binarySort(int[] arr) {
        int countZeros = 0;
        int countOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZeros++;
            else if (arr[i]==1) countOnes++;
        }
        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }
        for (int i = countZeros; i < countZeros+countOnes; i++) {
            arr[i] = 1;
        }

        for (int i = countZeros+countOnes; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }

}


