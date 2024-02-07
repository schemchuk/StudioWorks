package de.telran.grogAlgorytm.lesson_24_02_06;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrMaxSumm {
    public static void main(String[] args) {
        int[] array = {6, 7, 1, 2, -19, 8, 3, 0, -10, 5};
        System.out.println(maxSubarray(array));
    }
    public static int maxSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxEnding < 0) maxEnding = arr[i];
            else maxEnding = maxEnding + arr[i];
            if (maxEnding > maxSoFar) maxSoFar = maxEnding;
        }
        return maxSoFar;
    }
}