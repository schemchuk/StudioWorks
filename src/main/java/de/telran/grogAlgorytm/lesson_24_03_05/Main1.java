package de.telran.grogAlgorytm.lesson_24_03_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[][] array = {{3,4},{2,5},{0,2}};
        Arrays.sort(array,(a, b)->Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(array));
    }

    public static ArrayList<int[]> activities(int[][] array) {
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<int[]> picked = new ArrayList<>();
        picked.add(array[0]);
        int end = array[0][1];
        for (int i = 1; i < array.length; i++) {
            if (end <= array[i][0]) {
                picked.add(array[i]);
                end = array[i][1];
            }
        }
        return picked;
    }
}

